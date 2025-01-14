package org.app.service;

import org.app.controller.UserController;
import org.app.exceptions.OptionException;
import org.app.utils.AppStarter;
import org.app.utils.Constants;
import org.app.view.AppView;

public class AppService {

    UserController controller = new UserController();

    public void handleOption(int option) {
        switch (option) {
            case 1 -> controller.create();
            case 2 -> controller.read();
            case 3 -> controller.update();
            case 4 -> controller.delete();
            case 5 -> controller.readById();
            case 0 -> new AppView().getOutput(Integer.toString(option));
            default -> {
                try {
                    throw new OptionException(Constants.INCORRECT_OPTION_MSG);
                } catch (OptionException e) {
                    new AppView().getOutput(e.getMessage());
                    AppStarter.startApp();
                }
            }
        }
    }
}
