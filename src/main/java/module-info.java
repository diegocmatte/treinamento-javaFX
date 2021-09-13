module com.example.treinamentojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.fxml to javafx.fxml;
    exports com.example.fxml;

    opens com.example.basico;
    exports com.example.basico;

    opens com.example.layout;
    exports com.example.layout;
}