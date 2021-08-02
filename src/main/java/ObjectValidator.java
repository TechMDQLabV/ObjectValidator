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

        for (Field f : fields) {
            f.setAccessible(true);
            if (f.get(object) == null) {
                setEnumObjectValidatorNull(f, tClassName);
                return false;
            }

            if (!f.getType().toString().contains("java")) {
                ObjectValidator objectValidator = new ObjectValidator();
                Boolean b = objectValidator.validator(f.get(object));
                if (Boolean.FALSE.equals(b)) {
                    return false;
                }
            }

            for (EnumObjectValidator v : EnumObjectValidator.values()) {
                if (f.getName().equals(v.getField()) && tClassName.equals(v.getClase())) {
                    v.setMatch(f.get(object).toString().matches(v.getRegex()));
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
