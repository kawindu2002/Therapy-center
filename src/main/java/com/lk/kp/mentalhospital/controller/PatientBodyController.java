package com.lk.kp.mentalhospital.controller;

import com.lk.kp.mentalhospital.dto.tm.PatientTM;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class PatientBodyController implements Initializable {

    @FXML
    private TableColumn<PatientTM, String> addressCol;

    @FXML
    private Label addressLbl;

    @FXML
    private TextField addressTxt;

    @FXML
    private TableColumn<PatientTM, String> contactCol;

    @FXML
    private Label contactLbl;

    @FXML
    private TextField contactTxt;

    @FXML
    private TableColumn<PatientTM, String> firstNameCol;

    @FXML
    private Label firstNameLbl;

    @FXML
    private TextField firstNameTxt;

    @FXML
    private TableColumn<PatientTM, String> genderCol;

    @FXML
    private ComboBox<String> genderCombo;

    @FXML
    private Label genderLbl;

    @FXML
    private TableColumn<PatientTM, String> lastNameCol;

    @FXML
    private Label lastNameLbl;

    @FXML
    private TextField lastNameTxt;

    @FXML
    private AnchorPane patientBodyAnchPane;

    @FXML
    private TableView<PatientTM> patientBodyTbl;

    @FXML
    private Button patientDeleteBtn;

    @FXML
    private AnchorPane patientHeaderAnchPane;

    @FXML
    private TableColumn<PatientTM, String> patientIdCol;

    @FXML
    private Label patientIdLbl;

    @FXML
    private Label patientIdShowLbl;

    @FXML
    private Label patientManageLbl;

    @FXML
    private Button patientReportBtn;

    @FXML
    private Button patientResetBtn;

    @FXML
    private Button patientSaveBtn;

    @FXML
    private Button patientUpdateBtn;

    @FXML
    private Button searchBtn;

    @FXML
    private ComboBox<String> searchByProgramCombo;

    @FXML
    private Label searchByProgramLbl;

    @FXML
    private ImageView searchIcon;



    @FXML
    void genderComboActionClicked(ActionEvent event) {

    }

    @FXML
    void onClickPatientTable(MouseEvent event) {
        PatientTM selectedItem = patientBodyTbl.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            patientIdShowLbl.setText(selectedItem.getPatientID());
            firstNameTxt.setText(selectedItem.getFirstName());
            lastNameTxt.setText(selectedItem.getLastName());
            contactTxt.setText(selectedItem.getContact());
            addressTxt.setText(selectedItem.getAddress());
            genderCombo.getSelectionModel().select(selectedItem.getGender());

            patientSaveBtn.setDisable(true);

            patientDeleteBtn.setDisable(false);
            patientUpdateBtn.setDisable(false);
            patientResetBtn.setDisable(false);
            patientReportBtn.setDisable(false);
        }
    }

    @FXML
    void patientDeleteBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void patientReportBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void patientResetBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void patientSaveBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void patientUpdateBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void searchBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void searchByProgramComboActionClicked(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

            setCellValues();
            genderCombo.getItems().addAll("Male","Female","Other");

            try {
                refreshPage();
            } catch (SQLException e) {
                new Alert(Alert.AlertType.ERROR, "Fail to refresh page").show();
            }
    }


    private void setCellValues() {
        patientIdCol.setCellValueFactory(new PropertyValueFactory<>("patientID"));
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        contactCol.setCellValueFactory(new PropertyValueFactory<>("contact"));
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        genderCol.setCellValueFactory(new PropertyValueFactory<>("gender"));

    }

    private void refreshPage() throws SQLException {
//        loadNextPatientId();
//        loadTableData();

        patientSaveBtn.setDisable(false);

        patientUpdateBtn.setDisable(true);
        patientDeleteBtn.setDisable(true);

        firstNameTxt.setText("");
        lastNameTxt.setText("");
        contactTxt.setText("");
        addressTxt.setText("");
        genderCombo.getSelectionModel().clearSelection();

    }
}

//------------------- fixed ---------------------------------


//    @FXML
//    private Label dateShowLbl;
//
////    @FXML
////    private TableColumn<UserTM, String> nameCol;
//
//    @FXML
//    private Label nameLbl;
//
//    @FXML
//    private TextField nameTxt;
//
////    @FXML
////    private TableColumn<UserTM, String> passwordCol;
//
//    @FXML
//    private Label passwordLbl;
//
//    @FXML
//    private TextField passwordTxt;
////
////    @FXML
////    private TableColumn<UserTM, Date> regDateCol;
//
//    @FXML
//    private Label regDateLbl;
//
////    @FXML
////    private TableColumn<UserTM, String> roleCol;
//
//    @FXML
//    private Label roleLbl;
//
//    @FXML
//    private TextField roleTxt;
//
////    @FXML
////    private TableColumn<UserTM, String> stateCol;
//
//    @FXML
//    private ComboBox<String> stateCombo;
//
//    @FXML
//    private Label stateLbl;
//
//    @FXML
//    private AnchorPane userBodyAnchPane;
//
////    @FXML
////    private TableView<UserTM> userBodyTbl;
//
//    @FXML
//    private Button userDeleteBtn;
//
//    @FXML
//    private AnchorPane userHeaderAnchPane;
//
////    @FXML
////    private TableColumn<UserTM, String> userIdCol;
//
//    @FXML
//    private Label userIdLbl;
//
//    @FXML
//    private Label userIdShowLbl;
//
//    @FXML
//    private Label userManageLbl;
//
//    @FXML
//    private Button userResetBtn;
//
//    @FXML
//    private Button userSaveBtn;
//
//    @FXML
//    private Button userUpdateBtn;
//
//    @FXML
//    private ComboBox<String> roleCombo;
//
//
////    final UserModel userModel = new UserModel();
//
//
//    //------------------------------------------------------------------------------------------------------------------
//
//
//    @FXML
//    void userDeleteBtnActionClicked(ActionEvent event) throws SQLException {
////        String userId = userIdShowLbl.getText();
////
////        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure?", ButtonType.YES, ButtonType.NO);
////        Optional<ButtonType> optionalButtonType = alert.showAndWait();
////
////        if (optionalButtonType.isPresent() && optionalButtonType.get() == ButtonType.YES) {
////
////            boolean isDeleted = userModel.deleteUser(userId);
////            if (isDeleted) {
////                refreshPage();
////                new Alert(Alert.AlertType.INFORMATION, "User deleted...!").show();
////            } else {
////                new Alert(Alert.AlertType.ERROR, "Fail to delete user...!").show();
////            }
////        }
//    }
//
//    @FXML
//    void userResetBtnActionClicked(ActionEvent event) throws SQLException {
////        refreshPage();
//    }
//
//    @FXML
//    void userSaveBtnActionClicked(ActionEvent event) throws SQLException {
////        UserDTO userDTO = verifySaveUpdate();
////        if (userDTO != null) {
////            boolean isSaved = userModel.saveUser(userDTO);
////            if (isSaved) {
////                refreshPage();
////                new Alert(Alert.AlertType.INFORMATION, "User saved...!").show();
////            } else {
////                new Alert(Alert.AlertType.ERROR, "Fail to save user...!").show();
////            }
////        }else{
////            new Alert(Alert.AlertType.ERROR, "Fail to save user...").show();
////        }
//    }
//
//    @FXML
//    void userUpdateBtnActionClicked(ActionEvent event) throws SQLException {
////        UserDTO userDTO = verifySaveUpdate();
////        if (userDTO != null) {
////            boolean isUpdated = userModel.updateUser(userDTO);
////            if (isUpdated) {
////                refreshPage();
////                new Alert(Alert.AlertType.INFORMATION, "User updated...!").show();
////            } else {
////                new Alert(Alert.AlertType.ERROR, "Fail to update user...!").show();
////            }
////        }else{
////            new Alert(Alert.AlertType.ERROR, "Fail to update user...").show();
////        }
//    }
//
//    public void onClickUserTable(MouseEvent mouseEvent) throws SQLException {
////        setDefaultBorder();
////        UserTM userTM = userBodyTbl.getSelectionModel().getSelectedItem();
////        if (userTM != null) {
////
////            userIdShowLbl.setText(userTM.getUserID());
////            nameTxt.setText(userTM.getName());
////            passwordTxt.setText(userTM.getPassword());
////            roleCombo.getSelectionModel().select(userTM.getRole());
////            dateShowLbl.setText(userTM.getRegDate().toString());
////            stateCombo.getSelectionModel().select(userTM.getState());
////
////            userSaveBtn.setDisable(true);
////
////            userUpdateBtn.setDisable(false);
////            userDeleteBtn.setDisable(false);
////
////        }
//    }
//
//
//    //------------------------------------------------------------------------------------------------------------------
//
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//
////        setCellValues();
////        stateCombo.getItems().addAll("Inactive","Active");
////        roleCombo.getItems().addAll("Admin","Employee");
////
////        try {
////            refreshPage();
////        } catch (SQLException e) {
////            new Alert(Alert.AlertType.ERROR, "Fail to refresh page").show();
////        }
//    }
//
//
////    private void refreshPage() throws SQLException {
////        loadNextUserId();
////        loadTableData();
////        setDefaultBorder();
////
////        userSaveBtn.setDisable(false);
////
////        userUpdateBtn.setDisable(true);
////        userDeleteBtn.setDisable(true);
////
////        nameTxt.setText("");
////        nameTxt.setText("");
////        passwordTxt.setText("");
////        roleCombo.getSelectionModel().clearSelection();
////        dateShowLbl.setText(CommonUtil.date);
////        stateCombo.getSelectionModel().clearSelection();
////
////    }
////
////    private void setCellValues() {
////        userIdCol.setCellValueFactory(new PropertyValueFactory<>("userID"));
////        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
////        passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));
////        roleCol.setCellValueFactory(new PropertyValueFactory<>("role"));
////        regDateCol.setCellValueFactory(new PropertyValueFactory<>("regDate"));
////        stateCol.setCellValueFactory(new PropertyValueFactory<>("state"));
////
////    }
//
//
////    private void loadTableData() throws SQLException {
////        ArrayList<UserDTO> userDTOS = userModel.getAllUsers();
////
////        ObservableList<UserTM> userTMS = FXCollections.observableArrayList();
////
////        for (UserDTO userDTO : userDTOS) {
////            UserTM userTM = new UserTM(
////                    userDTO.getUserID(),
////                    userDTO.getName(),
////                    userDTO.getPassword(),
////                    userDTO.getRole(),
////                    userDTO.getRegDate(),
////                    userDTO.getState()
////            );
////            userTMS.add(userTM);
////        }
////
////        userBodyTbl.setItems(userTMS);
////    }
////
////
////    public void loadNextUserId() throws SQLException {
////        String nextUserId = userModel.getNextUserId();
////        userIdShowLbl.setText(nextUserId);
////    }
//
////    public UserDTO verifySaveUpdate() throws SQLException {
////        String userId = userIdShowLbl.getText();
////        String name = nameTxt.getText();
////        String password = passwordTxt.getText();
////        String role = roleCombo.getSelectionModel().getSelectedItem();
////        Date regDate = Date.valueOf(dateShowLbl.getText());
////        String state = stateCombo.getSelectionModel().getSelectedItem();
//
//    //set default border
//
////        setDefaultBorder();
//
//    //assign patterns
//
////        String namePattern = CommonUtil.namePattern;
//
//    //create boolean conditions
//
////        boolean isValidName = name.matches(namePattern) && !nameTxt.getText().equals("");;
////        boolean isNullState = stateCombo.getSelectionModel().getSelectedItem() == null ||
////                stateCombo.getSelectionModel().getSelectedItem().equals("");
////        boolean isNullPassword = passwordTxt.getText().equals("");
////        boolean isNullRole = roleCombo.getSelectionModel().getSelectedItem() == null ||
////                roleCombo.getSelectionModel().getSelectedItem().equals("");
//
//    //check valid booleans
//
////        if (!isValidName) {
////            System.out.println(nameTxt.getStyle());
////            nameTxt.setStyle(nameTxt.getStyle() +  CommonUtil.redColorBorder);
////            System.out.println("Invalid name!");
////        }
//
//    //check null booleans
////
////        if (isNullPassword) {
////            passwordTxt.setStyle(passwordTxt.getStyle() + CommonUtil.redColorBorder);
////            System.out.println("please enter password!");
////        }
////
////        if (isNullRole) {
////            new Alert(Alert.AlertType.ERROR, "please select the role").show();
////        }
////
////        if (isNullState) {
////            new Alert(Alert.AlertType.ERROR, "please select the state").show();
////        }
//
//
//    //validate and return object DTO
////
////        if (isValidName && !isNullState && !isNullPassword && !isNullRole) {
////            UserDTO userDTO = new UserDTO(
////                    userId,
////                    name,
////                    password,
////                    role,
////                    regDate,
////                    state
////            );
////
////            return userDTO;
////        }
////        return null;
////    }
//
//    public void setDefaultBorder() throws SQLException {
////        nameTxt.setStyle(nameTxt.getStyle() + CommonUtil.defaultColorBorder);
////        passwordTxt.setStyle(passwordTxt.getStyle() + CommonUtil.defaultColorBorder);
////        roleCombo.setStyle(roleCombo.getStyle() + CommonUtil.defaultColorBorder);
////        stateCombo.setStyle(stateCombo.getStyle() + CommonUtil.defaultColorBorder);
//    }
//}

