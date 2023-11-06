import models.AttributeValidator;
import models.AttributeValidatorList;
import models.ErrorMessage;


import java.lang.reflect.Field;

public class ObjectValidatorSingleton {


    private ErrorMessage errorMessage = new ErrorMessage();

    private static ObjectValidatorSingleton instance = null;

    private ObjectValidatorSingleton(){}

    public static ObjectValidatorSingleton getInstance(){
        if(instance == null){
            instance = new ObjectValidatorSingleton();
        }
        return instance;
    }

    public ErrorMessage validatorRecursive(Object object, AttributeValidatorList attributeValidatorList) throws ClassNotFoundException, IllegalAccessException {
        Class<?> tClass = Class.forName(object.getClass().getName());
        Field[] fields = tClass.getDeclaredFields();

        String tClassName = tClass.toString().substring(tClass.toString().lastIndexOf('.') + 1).trim();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.get(object) == null) {
                setErrorMessage(field, tClassName);
                return errorMessage;
            }

            if (!field.getType().toString().contains("java")) {
                errorMessage = validatorRecursive(field.get(object), attributeValidatorList);
                if (Boolean.FALSE.equals(errorMessage.getError())) {
                    return errorMessage;
                }
            }

            if (validateObject(object, tClassName, field, attributeValidatorList)){
                return errorMessage;
            }
        }

        return errorMessage;
    }

    private boolean validateObject(Object object, String tClassName, Field field, AttributeValidatorList attributeValidatorList) throws IllegalAccessException {
        AttributeValidator attributeValidator = findValidator(attributeValidatorList,object,tClassName,field);
        if (attributeValidator != null && !field.get(object).toString().matches(attributeValidator.getRegex())) {
            errorMessage.setError(Boolean.TRUE);
            return true;
        }
        errorMessage.setError(Boolean.FALSE);
        return false;
    }

    private AttributeValidator findValidator(AttributeValidatorList attributeValidatorList, Object object, String tClassName, Field field){
        return attributeValidatorList.getAttributeValidatorList().stream()
                .filter(v -> v.getField().equals(field.getName()) && v.getClase().equals(tClassName))
                .findFirst()
                .orElse(null);
    }

    private void setErrorMessage(Field f, String tClassName){
        errorMessage.setError(Boolean.TRUE);
        errorMessage.setField(f.getName());
        errorMessage.setClase(tClassName);
        errorMessage.setErrorMessage("Error - En la Entidad: " + tClassName + " se encontró el atributo " + f.getName() + " nulo");
    }
}
