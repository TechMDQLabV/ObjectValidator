package models;

public class AttributeValidator {
    private String field;
    private String clase;
    private String regex;
    private Boolean match;
    private String errorMessage;

    public AttributeValidator(String field, String clase, String regex, Boolean match, String errorMessage) {
        this.field = field;
        this.clase = clase;
        this.regex = regex;
        this.match = match;
        this.errorMessage = errorMessage;
    }

    public String getField() {
        return field;
    }

    public String getClase() {
        return clase;
    }

    public String getRegex() {
        return regex;
    }

    public Boolean getMatch() {
        return match;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return "AttributeValidator{" +
                "field='" + field + '\'' +
                ", clase='" + clase + '\'' +
                ", regex='" + regex + '\'' +
                ", match=" + match +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
