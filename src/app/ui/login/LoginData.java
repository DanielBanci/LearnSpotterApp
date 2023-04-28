package app.ui.login;

import app.App;
import app.ui.customs.RoundButton;
import app.ui.customs.RoundPanelWithShadow;
import app.ui.customs.RoundPasswordField;
import app.ui.customs.RoundTextField;
import app.ui.main_window.MainPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        loginDataPanel = new RoundPanelWithShadow();
        textFieldEmail = new RoundTextField();
        textFieldEmail.setMinimumSize(new Dimension(200,10));
        passwordField = new RoundPasswordField();
        loginButton = new RoundButton();
        loginButton.addActionListener(loginButtonActionListener());
    }

    /**
     * Makes the action from login button.
     * It will check user input, try to get user s account info and log in the user
     * @return action for login button
     */
    private ActionListener loginButtonActionListener(){
        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                        //TO DO: check input and login the users
                //complete code here

                //Open the app for the user
                App.getMainFrame().setContentPane(new MainPanel().getSupportPanel());
                App.getMainFrame().pack();
                App.getMainFrame().setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        };

        return act;
    }
    public JPanel getLoginDataPanel() {
        return loginDataPanel;
    }
}
