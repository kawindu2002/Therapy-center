package com.lk.kp.mentalhospital;

//import com.lk.kp.mentalhospital.config.FactoryConfiguration;
//import org.hibernate.Session;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application{
//    public static void main(String[] args) {
//        try (Session session = FactoryConfiguration.getInstance().getSession()) {
//            System.out.println("✅ Hibernate is connected to the database, my lord!");
//        } catch (Exception e) {
//            System.out.println("❌ Connection failed, my lord!");
//            e.printStackTrace();
//        }
//    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/icons/therapy-icon.png")));
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/GetStartedView.fxml"))));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

