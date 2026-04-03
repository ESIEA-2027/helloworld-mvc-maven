package com.jad.view;

import com.jad.controller.IController;
import com.jad.controller.Order;
import com.jad.model.IModel;

import java.util.Scanner;

public class View implements IView {
    private final IModel model;

    public View(final IModel model) {
        this.model = model;
    }

    @Override
    public void displayMessage(final IController controller, final String message) {
        System.out.println(message);
        final Scanner scanner = new Scanner(System.in);
        System.out.println(this.model.getContinue() + " (y/n)");
        if (scanner.next().equals("n")) controller.manageOrder(Order.STOP);
    }
}
