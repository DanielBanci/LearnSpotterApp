import app.ui_login.LoginWindow;

import javax.swing.*;

/**
 * Main class, the launch of the app.
 * Contains the frame of the app.
 * @author Daniel
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new LoginWindow().contentPanel);
        frame.setBounds(0,0,1000,600);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}