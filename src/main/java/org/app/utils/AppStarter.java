package org.app.utils;


import org.app.controller.AppController;
import org.app.service.AppService;
import org.app.view.AppView;

public class AppStarter {

    public static void startApp() {
        AppService service = new AppService();
        AppView view = new AppView();
        AppController controller = new AppController(view, service);
        controller.runApp();
    }
}
