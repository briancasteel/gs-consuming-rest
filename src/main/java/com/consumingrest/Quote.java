package com.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by BR026CA on 2/10/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private Value value;

    public Quote() {
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
