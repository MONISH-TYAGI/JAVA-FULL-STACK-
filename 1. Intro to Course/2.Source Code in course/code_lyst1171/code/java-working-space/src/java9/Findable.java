package java9;

import javax.swing.*;

public interface Findable {
    void find();

    private void loginLogic() {
        System.out.println("Login of 11 line");
    }

    default void findDefault() {
        System.out.println("starting of default functionality");
        loginLogic();
        System.out.println("ending of default functionality");
    }

    default void doSomeImportantTask() {
        loginLogic();

    }
}
