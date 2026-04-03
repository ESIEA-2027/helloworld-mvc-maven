package com.jad.view;

import javax.swing.*;

public class View implements IView {
    @Override
    public void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
