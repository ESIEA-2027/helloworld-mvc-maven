package com.jad.view;

import com.jad.controller.IController;

public interface IView {
    void displayMessage(IController controller, String message);
}
