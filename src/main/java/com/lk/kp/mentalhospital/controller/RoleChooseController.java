package com.lk.kp.mentalhospital.controller;

import com.lk.kp.mentalhospital.util.CommonUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class RoleChooseController {

    @FXML
    private AnchorPane adminChooseAnchPane;

    @FXML
    private ImageView admin_icon;

    @FXML
    private Button loginAsAdminBtn;

    @FXML
    private Button loginAsRecepBtn;

    @FXML
    private AnchorPane recepChooseAnchPane;

    @FXML
    private ImageView recep_icon;

    @FXML
    private AnchorPane roleChooseAnchPane;

    @FXML
    private ImageView roleChooseImg;


    @FXML
    void loginAsAdminBtnActionClicked(ActionEvent event) {
        CommonUtil.navigateTo(roleChooseAnchPane, "/view/LoginView.fxml");
//        CommonUtil.role = "Admin";
    }

    @FXML
    void loginAsRecepBtnActionClicked(ActionEvent event) {
        CommonUtil.navigateTo(roleChooseAnchPane,"/view/LoginView.fxml");
//        CommonUtil.role = "Receptionist";
    }
}
