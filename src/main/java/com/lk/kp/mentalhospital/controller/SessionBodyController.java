package com.lk.kp.mentalhospital.controller;

import com.lk.kp.mentalhospital.dto.tm.TherapySessionTM;
import com.lk.kp.mentalhospital.util.CommonUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

public class SessionBodyController implements Initializable {

    @FXML
    private TableColumn<TherapySessionTM, Double> costCol;

    @FXML
    private Label costLbl;

    @FXML
    private TextField costTxt;

    @FXML
    private TableColumn<TherapySessionTM, Date> dateCol;

    @FXML
    private Label dateLbl;

    @FXML
    private Label dateShowLbl;

    @FXML
    private TableColumn<TherapySessionTM, String> durationCol;

    @FXML
    private Label durationLbl;

    @FXML
    private TextField durationTxt;

    @FXML
    private TableColumn<TherapySessionTM, String> patientIdCol;

    @FXML
    private ComboBox<String> patientIdCombo;

    @FXML
    private Label patientNameLbl;

    @FXML
    private Label patientNameShowLbl;

    @FXML
    private Label patientidLbl;

    @FXML
    private TableColumn<TherapySessionTM, String> programIdCol;

    @FXML
    private ComboBox<String> programIdCombo;

    @FXML
    private Label programIdLbl;

    @FXML
    private Label programNameLbl;

    @FXML
    private Label programNameShowLbl;

    @FXML
    private AnchorPane sessionBodyAnchPane;

    @FXML
    private TableView<TherapySessionTM> sessionBodyTbl;

    @FXML
    private Button sessionDeleteBtn;

    @FXML
    private AnchorPane sessionHeaderAnchPane;

    @FXML
    private TableColumn<TherapySessionTM, String> sessionIdCol;

    @FXML
    private Label sessionIdLbl;

    @FXML
    private Label sessionIdShowLbl;

    @FXML
    private Label sessionManageLbl;

    @FXML
    private Button sessionReportsBtn;

    @FXML
    private Button sessionResetBtn;

    @FXML
    private Button sessionSaveBtn;

    @FXML
    private Button sessionUpdateBtn;

    @FXML
    private TableColumn<TherapySessionTM, String> stateCol;

    @FXML
    private ComboBox<String> stateCombo;

    @FXML
    private Label stateLbl;

    @FXML
    private TableColumn<TherapySessionTM, String> therapistIdCol;

    @FXML
    private ComboBox<String> therapistIdCombo;

    @FXML
    private Label therapistIdLbl;

    @FXML
    private Label therapistNameLbl;

    @FXML
    private Label therapistNameShowLbl;


    @FXML
    void onClickTherapistTable(MouseEvent event) {

    }

    @FXML
    void patientIdComboActionClicked(ActionEvent event) {

    }

    @FXML
    void programIdComboActionClicked(ActionEvent event) {

    }

    @FXML
    void sessionDeleteBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void sessionReportsBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void sessionResetBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void sessionSaveBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void sessionUpdateBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void stateComboActionClicked(ActionEvent event) {

    }

    @FXML
    void therapistIdComboActionClicked(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setCellValues();
        dateShowLbl.setText(CommonUtil.date);
        stateCombo.getItems().addAll("Completed","Pending");

    }

    private void setCellValues() {
        sessionIdCol.setCellValueFactory(new PropertyValueFactory<>("sessionID"));
        patientIdCol.setCellValueFactory(new PropertyValueFactory<>("patientID"));
        therapistIdCol.setCellValueFactory(new PropertyValueFactory<>("therapistID"));
        programIdCol.setCellValueFactory(new PropertyValueFactory<>("programID"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        durationCol.setCellValueFactory(new PropertyValueFactory<>("duration"));
        costCol.setCellValueFactory(new PropertyValueFactory<>("cost"));
        stateCol.setCellValueFactory(new PropertyValueFactory<>("paymentState"));

    }

}