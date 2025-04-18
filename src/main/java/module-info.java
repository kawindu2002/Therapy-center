module com.lk.kp.mentalhospital {
        requires javafx.controls;
        requires javafx.fxml;
        requires lombok;
        requires java.sql;
        requires org.hibernate.orm.core;
        requires jakarta.persistence;
        requires java.naming;
//        requires net.sf.jasperreports.core;

        opens com.lk.kp.mentalhospital.entity to org.hibernate.orm.core;
        opens com.lk.kp.mentalhospital.config to jakarta.persistence;

        opens com.lk.kp.mentalhospital.controller to javafx.fxml;
        opens com.lk.kp.mentalhospital.dto.tm to javafx.base;

        exports com.lk.kp.mentalhospital;
}



