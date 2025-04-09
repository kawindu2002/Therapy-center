module com.lk.kp.mentalhospital {
        requires javafx.controls;
        requires javafx.fxml;
        requires lombok;
        requires java.sql;
        requires net.sf.jasperreports.core;

        opens com.lk.kp.mentalhospital.controller to javafx.fxml;
        opens com.lk.kp.mentalhospital.dto.tm to javafx.base;
        exports com.lk.kp.mentalhospital;
}