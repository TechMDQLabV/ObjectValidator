import models.Account;
import models.AttributeValidatorList;
import models.AttributeValidator;
import models.Employee;
import models.ErrorMessage;


import static util.UtilReflection.log;


public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
        Employee e = new Employee("Sergio", "Garguir", "14676996", 59, new Account("123456", 15000));
        Account a = new Account("00001", 15000);
        Employee employee = new Employee();
        log().info(e.toString());
        log().info(employee.toString());
        log().info(a.toString());

        ObjectValidatorSingleton objectValidatorSingleton = ObjectValidatorSingleton.getInstance();
        ErrorMessage errorMessage = objectValidatorSingleton.validatorRecursive(employee, setAttributeValidatorList());
        log().info("************************** Start ****************************");
       // ObjectValidator objectValidator = new ObjectValidator();
        //objectValidator.validator(employee);
        log().info("*************************** End ***************************");

        //String error = objectValidatorSingleton.getError();
        if(!errorMessage.getError().equals(Boolean.TRUE)) {
            log().info(errorMessage.getField() + " " + errorMessage.getErrorMessage());
        }else{
            log().info("No hay errores..........");
        }
    }

    private static AttributeValidatorList setAttributeValidatorList(){
        AttributeValidatorList attributeValidatorList = new AttributeValidatorList();
        attributeValidatorList.addAttributeValidator(new AttributeValidator("accountNumber", "Account","[0-9]{1,10}", true, "Error en número de cuenta"));
        attributeValidatorList.addAttributeValidator(new AttributeValidator("lastName", "Employee","[a-zA-Z]{1,30}", true, "Error en el campo Apellido"));
        attributeValidatorList.addAttributeValidator(new AttributeValidator("name", "Employee","[a-zA-Z]{1,30}", true, "Error en el campo Nombre"));
        return attributeValidatorList;
    }

}
