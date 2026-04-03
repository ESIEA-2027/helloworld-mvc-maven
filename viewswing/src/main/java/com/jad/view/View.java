package com.jad.view;

import com.jad.controller.IController;
import com.jad.controller.Order;
import com.jad.model.IModel;

import javax.swing.*;

public class View implements IView {
    private final IModel model;

    public View(final IModel model) {
        this.model = model;
    }

    @Override
    public void displayMessage(final IController controller, final String message) {
        final int answer = JOptionPane.showConfirmDialog(null, message,
                                                         this.model.getContinue(),
                                                         JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.NO_OPTION) controller.manageOrder(Order.STOP);
    }
}
