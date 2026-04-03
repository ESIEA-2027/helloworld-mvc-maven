package com.jad.view;

import com.jad.controller.IController;
import com.jad.controller.Order;

import javax.swing.*;

public class View implements IView {
    @Override
    public void displayMessage(final IController controller, final String message) {
        final int answer = JOptionPane.showConfirmDialog(null, message, "Continue ?", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) controller.manageOrder(Order.STOP);
    }
}
