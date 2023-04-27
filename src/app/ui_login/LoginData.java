package app.ui_login;

import app.customs.RoundButton;
import app.customs.RoundPanel;
import app.customs.RoundPasswordField;
import app.customs.RoundTextField;

import javax.swing.*;
import java.awt.*;

/**
 * The class represents a panel with the login information and
 * the login button.
 * @author Daniel
 * @version 1.0
 */
public class LoginData {
    private JPanel loginDataPanel;//round panel with content
    private JTextField textFieldEmail;//the Email input                     TO DO: check input,check unique (?can be implemented directly in RoundTextField class)
    private JPasswordField passwordField;//the password input               TO DO: check input - to be strong enough(?same as above for RoundPasswordField

    private JButton loginButton; //button to log in                         TO DO: implement the action listener
    private JCheckBox showPasswordCheckBox; //check box to show password    TO DO: implement action listener

    /**
     * Creating the component properly.
     */
    private void createUIComponents() {
        loginDataPanel = new RoundPanel();
        textFieldEmail = new RoundTextField();
        textFieldEmail.setMinimumSize(new Dimension(200,10));
        passwordField = new RoundPasswordField();
        loginButton = new RoundButton();
    }
    public JPanel getLoginDataPanel() {
        return loginDataPanel;
    }
}
