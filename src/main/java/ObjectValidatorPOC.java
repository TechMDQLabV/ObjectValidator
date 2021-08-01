import models.EnumObjectValidator;

import java.lang.reflect.Field;

public class ObjectValidatorPOC {

    static String TAB = "";

    public boolean validator(Object object) throws ClassNotFoundException, IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();
        return validatorRecursive(fields, object);
    }

    private boolean validatorRecursive(Field[] fields, Object object) throws ClassNotFoundException, IllegalAccessException {
        TAB += "\t";
        Class tClass = Class.forName(object.getClass().getName());
        String tClassName = tClass.toString().substring(tClass.toString().lastIndexOf('.') + 1).trim();

        for (Field f : fields) {
            f.setAccessible(true);
            if (f.get(object) == null) {
                EnumObjectValidator.NULL.setField(f.getName());
                EnumObjectValidator.NULL.setClase(tClassName);
                EnumObjectValidator.NULL.setErrorMessage("Error - En la Entidad: " + tClassName + " se encontró el atributo " + f.getName() + " nulo");
                EnumObjectValidator.NULL.setMatch(false);
                return false;
            }
            String type = f.getType().toString().substring(f.getType().toString().lastIndexOf('.') + 1).trim();
            System.out.println("\n-------------------------------------------------------------------------------------");
            System.out.println(TAB + ". type: " + f.getType());
            System.out.println(TAB + ". type: " + type);
            System.out.println(TAB + ". name: " + f.getName());
            System.out.println(TAB + ". class: " + f.getClass());
            System.out.println(TAB + ". " + f.getType().getFields().length);

            if (!f.getType().toString().contains("java")) {
                ObjectValidatorPOC objectValidator = new ObjectValidatorPOC();
                Boolean b = objectValidator.validator(f.get(object));
                if(Boolean.FALSE.equals(b)){
                    return false;
                }
            }

            for (EnumObjectValidator v : EnumObjectValidator.values()) {
                System.out.println(TAB + "********************************************************");
                System.out.println(TAB + "f.getName(): " + f.getName() + " v.getField(): " + v.getField());
                System.out.println(TAB + "tClassName: " + tClassName + " v.getClase(): " + v.getClase());
                System.out.println(TAB + "********************************************************");
                if (f.getName().equals(v.getField()) && tClassName.contains(v.getClase())) {
                    v.setMatch(f.get(object).toString().matches(v.getRegex()));
                    System.out.println(TAB + "RegEx " + v.getRegex() + " String: " + f.get(object) + " NameEnum: " + v.name() + " " + f.get(object).toString().matches(v.getRegex()));
                    if(Boolean.FALSE.equals(v.getMatch())){
                        return false;
                    }
                }
            }
        }

        return true;
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
