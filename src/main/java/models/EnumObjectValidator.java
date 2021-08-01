package models;

public enum EnumObjectValidator {
    ACCOUNTNUMBER(
            "accountNumber",
            "Account",
            "[0-9]{1,10}",
            true,
            "Error en número de cuenta"),
    LASTNAME("lastName",
            "Employee",
            "[a-zA-Z]{1,30}",
            true,
            "Error en el campo Apellido"),
    NAME("name",
            "Employee",
            "[a-zA-Z]{1,30}",
            true,
            "Error en el campo Nombre"),
    NULL("",
            "",
            "",
            true,
            "Error NULL"
    );

    String field;
    String clase;
    String regex;
    Boolean match;
    String errorMessage;

    EnumObjectValidator(String field, String clase, String regex, Boolean match, String errorMessage) {
        this.field = field;
        this.clase = clase;
        this.regex = regex;
        this.match = match;
        this.errorMessage = errorMessage;
    }

    public void setField(String field) {
        this.field = field;
    }


    public String getField() {
        return field;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getClase() {
        return clase;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }

    public void setMatch(Boolean match) {
        this.match = match;
    }

    public Boolean getMatch() {
        return match;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}