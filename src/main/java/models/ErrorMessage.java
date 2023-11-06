package models;

public class ErrorMessage {
    private Boolean error;
    private String field;
    private String clase;
    private String errorMessage;

    public ErrorMessage() {
    }

    public ErrorMessage(Boolean error, String field, String clase, String errorMessage) {
        this.field = field;
        this.clase = clase;
        this.errorMessage = errorMessage;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
