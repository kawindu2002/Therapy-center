package com.lk.kp.mentalhospital.controller;

//import edu.ijse.gdse71.library.dto.UserDTO;
//import edu.ijse.gdse71.library.model.UserModel;
//import edu.ijse.gdse71.library.util.CommonUtil;
import com.lk.kp.mentalhospital.util.CommonUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

import java.sql.SQLException;

public class LoginController {

    @FXML
    private Button backBtn;

    @FXML
    private ImageView eye_icon;

    @FXML
    private AnchorPane loginAnchPane;

    @FXML
    private Button loginBtn;

    @FXML
    private AnchorPane loginContentAnchPane;

    @FXML
    private ImageView loginImg;

    @FXML
    private Label loginLbl;

    @FXML
    private Rectangle eye_container;

    @FXML
    private Line loginLine;

    @FXML
    private Label passwordLbl;

    @FXML
    private PasswordField passwordTxt;

    @FXML
    private Label userIdLbl;

    @FXML
    private TextField userIdTxt;

//
//    final UserModel userModel = new UserModel();
//
//    private String userId;
//    private String password;
//    private String role;
//
    @FXML
    void backBtnActionClicked(ActionEvent event) {
        CommonUtil.navigateTo(loginAnchPane,"/view/RoleChooseView.fxml");
    }
//
    @FXML
    void loginBtnActionClicked(ActionEvent event) throws SQLException {
        CommonUtil.navigateTo(loginAnchPane,"/view/DashBoardView.fxml");
//
//
//        validateUserDetails();
//
//        boolean validUserId = userIdTxt.getText().equals(userId);
//        boolean validPassword = passwordTxt.getText().equals(password);
//
//        if (CommonUtil.role.equals(role)){
//            if (!validUserId && !validPassword) {
//                new Alert(Alert.AlertType.ERROR, "Username & password are invalid!").show();
//            }else if (!validUserId){
//                new Alert(Alert.AlertType.ERROR, "Username is invalid!").show();
//            }else if (!validPassword) {
//                new Alert(Alert.AlertType.ERROR, "Password is invalid!").show();
//            }else{
//                CommonUtil.username = userId;
//                CommonUtil.password = password;
//                CommonUtil.navigateTo(loginAnchPane, "/view/DashBoardView.fxml");
//            }
//        }else{
//            new Alert(Alert.AlertType.ERROR, "Check the role!").show();
//        }
    }


    public void eyeBtnActionClicked(ActionEvent actionEvent) {
    }


//    void validateUserDetails() throws SQLException {
//        String selectedUserId = userIdTxt.getText();
//        UserDTO userDTO = userModel.findById(selectedUserId);
//
//        if (userDTO != null) {
//            userId = userDTO.getUserID();
//            password = userDTO.getPassword();
//            role = userDTO.getRole();
//        }
//    }
}


//=====================================================================
//
//@FXML
//private Button eyeBtn;
//
//@FXML
//private ImageView eye_icon;
//
//@FXML
//private AnchorPane loginAnchPane;
//
//@FXML
//private Button loginBtn;
//
//@FXML
//private AnchorPane loginContentAnchPane;
//
//@FXML
//private ImageView loginImg;
//
//@FXML
//private Label loginLbl;
//
//@FXML
//private Line loginLine;
//
//@FXML
//private Label passwordLbl;
//
//@FXML
//private PasswordField passwordTxt;
//
//@FXML
//private ComboBox<?> roleCombo;
//
//@FXML
//private Label roleLbl;
//
//@FXML
//private Label userIdLbl;
//
//@FXML
//private TextField userIdTxt;
//
//@FXML
//void eyeBtnActionClicked(ActionEvent event) {
//
//}
//
//@FXML
//void loginBtnActionClicked(ActionEvent event) {
//
//}
//
//@FXML
//void roleComboActionClicked(ActionEvent event) {
//
//}
//
