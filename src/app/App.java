package app;

import app.ui.login.LoginWindow;

import javax.swing.*;

/**
 * Main class, the launch of the app.
 * Contains the frame of the app.
 * @author Daniel
 * @version 1.0
 */
public class App {
    public static JFrame getMainFrame() {
        return mainFrame;
    }

    private static JFrame mainFrame;

    public static void main(String[] args) {
        mainFrame  = new JFrame();
        mainFrame.setContentPane(new LoginWindow().contentPanel);
        mainFrame.setBounds(0,0,1000,600);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        mainFrame.setVisible(true);
    }
}
