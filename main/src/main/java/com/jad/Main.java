package com.jad;

import com.jad.controller.Controller;
import com.jad.controller.IController;
import com.jad.model.IModel;
import com.jad.model.Model;
import com.jad.view.IView;
import com.jad.view.View;

public enum Main {
    ;

    public static void main(String[] args) {
        IController controller = new Controller();
        IView view = new View();
        IModel model = new Model();
        controller.setView(view);
        controller.setModel(model);
        controller.proceed();
    }
}