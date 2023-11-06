package models;

import java.util.ArrayList;
import java.util.List;

public class AttributeValidatorList {
    private final List<AttributeValidator> attributeValidatorList;

    public AttributeValidatorList() {
        this.attributeValidatorList = new ArrayList<>();
    }

    public List<AttributeValidator> getAttributeValidatorList() {
        return attributeValidatorList;
    }

    public void addAttributeValidator(AttributeValidator attributeValidator){
        this.attributeValidatorList.add(attributeValidator);
    }
}
