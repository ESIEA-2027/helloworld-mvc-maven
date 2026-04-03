package com.jad.controller;

import com.jad.model.IModel;
import com.jad.view.IView;

public class Controller implements IController {
    private IView view;
    private IModel model;
    private boolean running;

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
        this.running = true;
        do {
            this.view.displayMessage(this, this.model.getMessage());
        } while (this.running);
    }

    @Override
    public void manageOrder(final Order order) {
        if (order == Order.STOP) this.running = false;
    }
}
