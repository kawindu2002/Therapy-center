package com.lk.kp.mentalhospital.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CommonUtil {

    // store regex patterns
    public static String namePattern = "^[A-Za-z\\. ]+$";
    public static String contactPattern = "^(\\d+)||((\\d+\\.)(\\d){2})$";
    public static String mailPattern = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
    public static String pricePattern =  "^\\d+(\\.\\d{2})?$";
    public static String datePattern = "^(?:(?:19|20)\\d\\d)-(?:0[1-9]|1[0-2])-(?:0[1-9]|[12][0-9]|3[01])$";
    public static String zeroPositivePattern = "^\\d+$";


    // store border color changes
    public static String defaultColorBorder = ";-fx-border-color: #000000;";
    public static String redColorBorder = ";-fx-border-color: red;";

    // use to navigate between anchor panes
    public static void navigateTo(AnchorPane anch, String fxmlPath) {
        try {
            anch.getChildren().clear();
            AnchorPane load = FXMLLoader.load(CommonUtil.class.getResource(fxmlPath));
            anch.getChildren().add(load);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR, "Fail to load panel!").show();
        }
    }

//    //Manage update & delete Btn user permissions
//
//    public static void userPermissionManage(Button updateBtn , Button deletebtn){
//        if (CommonUtil.role.equals("Employee")) {
//            updateBtn.setDisable(true);
//            deletebtn.setDisable(true);
//        }
//    }
//
//    //popup window
//    public static void getPopup(String fxml,Button btn) {
//        try {
//            // Load the mail dialog from FXML file
//            FXMLLoader loader = new FXMLLoader(CommonUtil.class.getResource(fxml));
//            Parent load = loader.load();
//
//            Stage stage = new Stage();
//            stage.setScene(new Scene(load));
//            stage.setResizable(false);
//            stage.centerOnScreen();
//            stage.getIcons().add(new Image(CommonUtil.class.getResourceAsStream("/icon/usercardIcon.png")));
//
//            // Set window as modal
//            stage.initModality(Modality.APPLICATION_MODAL);
//
//            Window underWindow = btn.getScene().getWindow();
//            stage.initOwner(underWindow);
//
//            stage.showAndWait();
//        } catch (IOException e) {
//            new Alert(Alert.AlertType.ERROR, "Fail to load window..!");
//        }
//    }
//
}
