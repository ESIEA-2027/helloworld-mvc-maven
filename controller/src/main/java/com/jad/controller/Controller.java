package com.jad.controller;

import com.jad.model.IModel;
import com.jad.view.IView;

public class Controller implements IController {
    private IView view;
    private IModel model;

    @Override
    public void setModel(final IModel model) {
        this.model = model;
    }

    @Override
    public void setView(final IView view) {
        this.view = view;
    }

    @Override
    public void proceed() {
        if (this.view == null) throw new RuntimeException("View cannot be null.");
        if (this.model == null) throw new RuntimeException("Model cannot be null.");
        this.view.displayMessage(this.model.getMessage());
    }
}
