module co.edu.uniquindio.templatemethod {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.templatemethod to javafx.fxml;
    exports co.edu.uniquindio.templatemethod;
    exports co.edu.uniquindio.templatemethod.model;
    opens co.edu.uniquindio.templatemethod.model to javafx.fxml;
}