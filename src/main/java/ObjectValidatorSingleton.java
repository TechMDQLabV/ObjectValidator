import models.EnumObjectValidator;

import java.lang.reflect.Field;

public class ObjectValidatorSingleton {

    private static ObjectValidatorSingleton instance = null;

    private ObjectValidatorSingleton(){}

    public static ObjectValidatorSingleton getInstance(){
        if(instance == null){
            instance = new ObjectValidatorSingleton();
        }
        return instance;
    }

    public boolean validatorRecursive(Object object) throws ClassNotFoundException, IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();
        boolean result = true;
        Class<?> tClass = Class.forName(object.getClass().getName());
        String tClassName = tClass.toString().substring(tClass.toString().lastIndexOf('.') + 1).trim();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.get(object) == null) {
                setEnumObjectValidatorNull(field, tClassName);
                return false;
            }

            if (!field.getType().toString().contains("java")) {
                Boolean b = validatorRecursive(field.get(object));
                if (Boolean.FALSE.equals(b)) {
                    return false;
                }
            }

            if (validateObjec(object, tClassName, field)){
                return false;
            }
        }

        return result;
    }

    private boolean validateObjec(Object object, String tClassName, Field field) throws IllegalAccessException {
        for (EnumObjectValidator v : EnumObjectValidator.values()) {
            if (field.getName().equals(v.getField()) && tClassName.equals(v.getClase())) {
                v.setMatch(field.get(object).toString().matches(v.getRegex()));
                if (Boolean.FALSE.equals(v.getMatch())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void setEnumObjectValidatorNull(Field f, String tClassName){
        EnumObjectValidator.NULL.setField(f.getName());
        EnumObjectValidator.NULL.setClase(tClassName);
        EnumObjectValidator.NULL.setErrorMessage("Error - En la Entidad: " + tClassName + " se encontró el atributo " + f.getName() + " nulo");
        EnumObjectValidator.NULL.setMatch(false);
    }

    public String getError() {
        String retorno = "";
        for (EnumObjectValidator e : EnumObjectValidator.values()) {
            if (Boolean.FALSE.equals(e.getMatch())) {
                retorno = e.name();
            }
        }
        return retorno;
    }
}
