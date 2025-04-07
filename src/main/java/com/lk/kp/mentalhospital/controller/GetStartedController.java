package com.lk.kp.mentalhospital.controller;

import com.lk.kp.mentalhospital.util.CommonUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class GetStartedController {

    @FXML
    private AnchorPane getStartedAnchPane;

    @FXML
    private Button getStartedBtn;

    @FXML
    private ImageView getStartedImg;

    @FXML
    private Label stcLbl;

    @FXML
    private Label toTheLbl;

    @FXML
    private Label welcomeLbl;

    @FXML
    void getStartedBtnActionClicked(ActionEvent event) {
        CommonUtil.navigateTo(getStartedAnchPane,"/view/RoleChooseView.fxml");

    }

}
