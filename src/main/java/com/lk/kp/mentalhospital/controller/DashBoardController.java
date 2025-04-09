package com.lk.kp.mentalhospital.controller;

import com.lk.kp.mentalhospital.util.CommonUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardController implements Initializable {

    @FXML
    private AnchorPane dashBoardAnchPane;

    @FXML
    private AnchorPane dashBoardBodyAnchPane;

    @FXML
    private AnchorPane dashBoardDateCountAnchPane;

    @FXML
    private AnchorPane dashBoardHeaderAnchPane;

    @FXML
    private AnchorPane dashBoardNavigationAnchPane;

    @FXML
    private Label dateLbl;

    @FXML
    private Label dateShowLbl;

    @FXML
    private Label headerLbl;

    @FXML
    private Button patientManageBtn;

    @FXML
    private Button paymentManageBtn;

    @FXML
    private Button programManageBtn;

    @FXML
    private Button registrationManageBtn;

    @FXML
    private Button sessionManageBtn;

    @FXML
    private Button signOutBtn;

    @FXML
    private Button therapistManageBtn;

    @FXML
    private Label timeLbl;

    @FXML
    private Label timeShowLbl;

    @FXML
    private Label userIdLbl;

    @FXML
    private ImageView userImg;

    @FXML
    private Button userManageBtn;

    @FXML
    void patientManageBtnActionClicked(ActionEvent event) {
        CommonUtil.navigateTo(dashBoardBodyAnchPane,"/view/PatientBodyView.fxml");

    }

    @FXML
    void paymentManageBtnActionClicked(ActionEvent event) {
        CommonUtil.navigateTo(dashBoardBodyAnchPane,"/view/PaymentBodyView.fxml");

    }

    @FXML
    void programManageBtnActionClicked(ActionEvent event) {
        CommonUtil.navigateTo(dashBoardBodyAnchPane,"/view/ProgramBodyView.fxml");

    }

    @FXML
    void registrationManageBtnActionClicked(ActionEvent event) {
        CommonUtil.navigateTo(dashBoardBodyAnchPane,"/view/RegistrationBodyView.fxml");

    }

    @FXML
    void sessionManageBtnActionClicked(ActionEvent event) {
        CommonUtil.navigateTo(dashBoardBodyAnchPane,"/view/SessionBodyView.fxml");

    }

    @FXML
    void signOutBtnActionClicked(ActionEvent event) {
        CommonUtil.navigateTo(dashBoardAnchPane,"/view/LoginView.fxml");

    }

    @FXML
    void therapistManageBtnActionClicked(ActionEvent event) {
        CommonUtil.navigateTo(dashBoardBodyAnchPane,"/view/TherapistBodyView.fxml");

    }

    @FXML
    void userManageBtnActionClicked(ActionEvent event) {
        CommonUtil.navigateTo(dashBoardBodyAnchPane,"/view/UserBodyView.fxml");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CommonUtil.navigateTo(dashBoardBodyAnchPane,"/view/TherapistBodyView.fxml");

            dateShowLbl.setText(" "+CommonUtil.date);
            CommonUtil.setTime(timeShowLbl);

            userIdLbl.setText(CommonUtil.userId);

            if (CommonUtil.role.equals("Receptionist")) {
                userImg.setImage(new Image(getClass().getResourceAsStream("/images/receptionist.png")));
                therapistManageBtn.setDisable(true);
                programManageBtn.setDisable(true);
            }else if (CommonUtil.role.equals("Manager")){
                userImg.setImage(new Image(getClass().getResourceAsStream("/images/manager.png")));
            }
    }

}

