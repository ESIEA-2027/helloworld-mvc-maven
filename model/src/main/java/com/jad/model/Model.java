package com.jad.model;

public class Model implements IModel {
    @Override
    public String getMessage() {
        return "Hello world!";
    }

    @Override
    public String getContinue() {
        return "Continue ?";
    }
}
