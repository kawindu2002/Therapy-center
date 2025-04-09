package com.lk.kp.mentalhospital.controller;

//import edu.ijse.gdse71.library.dto.UserDTO;
//import edu.ijse.gdse71.library.model.UserModel;
//import edu.ijse.gdse71.library.util.CommonUtil;
import com.lk.kp.mentalhospital.util.CommonUtil;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

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
    private Line loginLine;

    @FXML
    private Label passwordLbl;

    @FXML
    private PasswordField passwordTxt;

    @FXML
    private ComboBox<?> roleCombo;

    @FXML
    private Label roleLbl;

    @FXML
    private ToggleButton showToggle;

    @FXML
    private Label shownPasswordLbl;

    @FXML
    private Label userIdLbl;

    @FXML
    private TextField userIdTxt;



    @FXML
    void loginBtnActionClicked(ActionEvent event) {

    }

    @FXML
    void passwordKeyTyped(KeyEvent event) {
        shownPasswordLbl.textProperty().bind(Bindings.concat(passwordTxt.getText()));
    }

    @FXML
    void roleComboActionClicked(ActionEvent event) {

    }

    @FXML
    void showToggleOnAction(ActionEvent event) {
        if (showToggle.isSelected()) {
            shownPasswordLbl.setVisible(true);
            shownPasswordLbl.textProperty().bind(Bindings.concat(passwordTxt.getText()));
            showToggle.setText("hide");
        }else{
            shownPasswordLbl.setVisible(false);
            showToggle.setText("show");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        shownPasswordLbl.setVisible(false);
    }


//
//    final UserModel userModel = new UserModel();
//
//    private String userId;
//    private String password;
//    private String role;
//
//
//    @FXML
//    void loginBtnActionClicked(ActionEvent event) throws SQLException {//
//        validateUserDetails();
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
//    }


//

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

