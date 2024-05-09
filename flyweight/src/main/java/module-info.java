module co.edu.uniquindio.flyweight {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.flyweight to javafx.fxml;
    exports co.edu.uniquindio.flyweight;
    opens co.edu.uniquindio.flyweight.viewController;
    exports co.edu.uniquindio.flyweight.viewController;

    opens co.edu.uniquindio.flyweight.model;
    exports co.edu.uniquindio.flyweight.model;
    exports co.edu.uniquindio.flyweight.model.assets;
    opens co.edu.uniquindio.flyweight.model.assets;
}