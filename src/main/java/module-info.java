module com.example.proiect_fis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proiect_fis to javafx.fxml;
    exports com.example.proiect_fis;
}