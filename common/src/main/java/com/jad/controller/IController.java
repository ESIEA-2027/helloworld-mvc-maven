package com.jad.controller;

import com.jad.model.IModel;
import com.jad.view.IView;

public interface IController {
    void setModel(IModel model);

    void setView(IView view);

    void proceed();

    void manageOrder(Order order);
}
