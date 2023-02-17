module com.npnp.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.npnp.bmiapp to javafx.fxml;
    exports com.npnp.bmiapp;
}
