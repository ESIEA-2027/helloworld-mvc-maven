package com.jad.view;

import com.jad.controller.IController;

public class View implements IView {
    @Override
    public void displayMessage(final IController iController, final String message) {
        System.out.println(message);
    }
}
