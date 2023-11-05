import models.EnumObjectValidator;

import java.lang.reflect.Field;

public class ObjectValidator {

    public boolean validator(Object object) throws ClassNotFoundException, IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();
        return validatorRecursive(fields, object);
    }

    private boolean validatorRecursive(Field[] fields, Object object) throws ClassNotFoundException, IllegalAccessException {
        Class tClass = Class.forName(object.getClass().getName());
        String tClassName = tClass.toString().substring(tClass.toString().lastIndexOf('.') + 1).trim();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.get(object) == null) {
                setEnumObjectValidatorNull(field, tClassName);
                return false;
            }

            if (!field.getType().toString().contains("java")) {
                ObjectValidator objectValidator = new ObjectValidator();
                Boolean b = objectValidator.validator(field.get(object));
                if (Boolean.FALSE.equals(b)) {
                    return false;
                }
            }

            for (EnumObjectValidator v : EnumObjectValidator.values()) {
                if (field.getName().equals(v.getField()) && tClassName.equals(v.getClase())) {
                    v.setMatch(field.get(object).toString().matches(v.getRegex()));
                    if (Boolean.FALSE.equals(v.getMatch())) {
                        return false;
                    }
                }
            }
        }

        return true;
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
