package com.lk.kp.mentalhospital.controller;

import com.lk.kp.mentalhospital.dto.tm.TherapistTM;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class TherapistBodyController implements Initializable {

    @FXML
    private TableColumn<TherapistTM, String> contactCol;

    @FXML
    private Label contactLbl;

    @FXML
    private TextField contactTxt;

    @FXML
    private TableColumn<TherapistTM, String> nameCol;

    @FXML
    private Label nameLbl;

    @FXML
    private TextField nameTxt;

    @FXML
    private TableColumn<TherapistTM, String> programIdCol;

    @FXML
    private ComboBox<String> programIdCombo;

    @FXML
    private Label programIdLbl;

    @FXML
    private Label programNameLbl;

    @FXML
    private Label programNameShowLbl;

    @FXML
    private TableColumn<TherapistTM, String> specificationCol;

    @FXML
    private ComboBox<String> specificationCombo;

    @FXML
    private Label specificationLbl;

    @FXML
    private AnchorPane therapistBodyAnchPane;

    @FXML
    private TableView<TherapistTM> therapistBodyTbl;

    @FXML
    private Button therapistDeleteBtn;

    @FXML
    private AnchorPane therapistHeaderAnchPane;

    @FXML
    private TableColumn<TherapistTM, String> therapistIdCol;

    @FXML
    private Label therapistIdLbl;

    @FXML
    private Label therapistIdShowLbl;

    @FXML
    private Label therapistManageLbl;

    @FXML
    private Button therapistResetBtn;

    @FXML
    private Button therapistSaveBtn;

    @FXML
    private Button therapistUpdateBtn;


    @FXML
    void onClickTherapistTable(MouseEvent event) {

    }

    @FXML
    void programIdComboActionClicked(ActionEvent event) {

    }

    @FXML
    void specificationComboActionClicked(ActionEvent event) {

    }

    @FXML
    void therapistDeleteBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void therapistResetBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void therapistSaveBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void therapistUpdateBtnActionClicked(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}


// ----------------- fixed -----------------------------------------------
//
//
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
//
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
//    //------------------------------------------------------------------------------------------------------------------
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
//
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

    //assign patterns

//        String namePattern = CommonUtil.namePattern;

    //create boolean conditions

//        boolean isValidName = name.matches(namePattern) && !nameTxt.getText().equals("");;
//        boolean isNullState = stateCombo.getSelectionModel().getSelectedItem() == null ||
//                stateCombo.getSelectionModel().getSelectedItem().equals("");
//        boolean isNullPassword = passwordTxt.getText().equals("");
//        boolean isNullRole = roleCombo.getSelectionModel().getSelectedItem() == null ||
//                roleCombo.getSelectionModel().getSelectedItem().equals("");

    //check valid booleans

//        if (!isValidName) {
//            System.out.println(nameTxt.getStyle());
//            nameTxt.setStyle(nameTxt.getStyle() +  CommonUtil.redColorBorder);
//            System.out.println("Invalid name!");
//        }

    //check null booleans
//
//        if (isNullPassword) {
//            passwordTxt.setStyle(passwordTxt.getStyle() + CommonUtil.redColorBorder);
//            System.out.println("please enter password!");
//        }
//
//        if (isNullRole) {
//            new Alert(Alert.AlertType.ERROR, "please select the role").show();
//        }
//
//        if (isNullState) {
//            new Alert(Alert.AlertType.ERROR, "please select the state").show();
//        }


    //validate and return object DTO
//
//        if (isValidName && !isNullState && !isNullPassword && !isNullRole) {
//            UserDTO userDTO = new UserDTO(
//                    userId,
//                    name,
//                    password,
//                    role,
//                    regDate,
//                    state
//            );
//
//            return userDTO;
//        }
//        return null;
//    }

//    public void setDefaultBorder() throws SQLException {
////        nameTxt.setStyle(nameTxt.getStyle() + CommonUtil.defaultColorBorder);
////        passwordTxt.setStyle(passwordTxt.getStyle() + CommonUtil.defaultColorBorder);
////        roleCombo.setStyle(roleCombo.getStyle() + CommonUtil.defaultColorBorder);
////        stateCombo.setStyle(stateCombo.getStyle() + CommonUtil.defaultColorBorder);
//    }
//}
