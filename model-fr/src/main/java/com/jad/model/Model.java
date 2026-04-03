package com.jad.model;

public class Model implements IModel {
    @Override
    public String getMessage() {
        return "Bonjour le monde !";
    }


    @Override
    public String getContinue() {
        return "Voulez-vous continuez ?";
    }
}
