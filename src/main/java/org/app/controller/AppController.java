package org.app.controller;


import org.app.service.AppService;
import org.app.view.AppView;

public class AppController {

    AppView view;
    AppService service;

    public AppController(AppView view, AppService service) {
        this.view = view;
        this.service = service;
    }

    public void runApp() {
        service.handleOption(view.getOption());
    }
}
