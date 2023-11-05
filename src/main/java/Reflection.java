import models.Account;
import models.Employee;
import models.EnumObjectValidator;

import static java.lang.System.*;


public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
        Employee e = new Employee("Sergio", "Garguir", "14676996", 59, new Account("123456", 15000));
        Account a = new Account("00001", 15000);
        Employee employee = new Employee();
        out.println(e);
        out.println(employee);
        out.println(a);
        ObjectValidatorSingleton.getInstance().validatorRecursive(employee);
        out.println("\n************************** Start ****************************");
        ObjectValidator objectValidator = new ObjectValidator();
        objectValidator.validator(employee);
        out.println("\n*************************** End ***************************");

        String error = objectValidator.getError();
        if(!error.isEmpty()) {
            out.println(EnumObjectValidator.valueOf(error).getField() + " " + EnumObjectValidator.valueOf(error).getErrorMessage());
        }else{
            out.println("No hay errores..........");
        }
    }

}
