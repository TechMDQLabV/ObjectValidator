import models.Account;
import models.Employee;
import models.EnumObjectValidator;


public class reflection {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
        Employee e = new Employee("Sergio", "Garguir", "14676996", 59, new Account("123456", 15000));
        Account a = new Account("00001", 15000);
        Employee employee = new Employee();
        System.out.println(e);
        System.out.println(employee);
        System.out.println(a);

        System.out.println("\n************************** Start ****************************");
        ObjectValidator objectValidator = new ObjectValidator();
        objectValidator.validator(employee);
        System.out.println("\n*************************** End ***************************");

        String error = objectValidator.getError();
        if(!error.isEmpty()) {
            System.out.println(EnumObjectValidator.valueOf(error).getField() + " " + EnumObjectValidator.valueOf(error).getErrorMessage());
        }else{
            System.out.println("No hay errores..........");
        }
    }

}
