package com.lk.kp.mentalhospital.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CommonUtil {

    // use to navigate between anchor panes
    public static void navigateTo(AnchorPane anch, String fxmlPath) {
        try {
            anch.getChildren().clear();
            AnchorPane load = FXMLLoader.load(CommonUtil.class.getResource(fxmlPath));
            anch.getChildren().add(load);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR, "Fail to load panel!").show();
            e.printStackTrace();
        }
    }

}
