package app.ui_login;

import app.customs.ImageResizer;
import app.ui_login.LoginData;

import javax.swing.*;
import java.awt.*;

/**
 * This class represents the login window content.
 * @author Daniel
 * @version 1.0
 */
public class LoginWindow {
    public JPanel contentPanel;//main panel
    private JPanel leftPanel;//left panel with login data
    private JPanel loginDataPanel;//panel with the login data
    private JLabel textImageLbl;//resizable image with a welcoming message
    private ImageIcon background;//background image

    public LoginWindow(){
    }

    private void createUIComponents() {
        background = new ImageIcon(this.getClass().getResource("/login_background.png"));

        //set image as background
        contentPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background.getImage(),
                        0, 0, null);
                this.setOpaque(true);
            }
        };

        //make left panel translucent
        leftPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the background color with an alpha value
                g.setColor(new Color(0, 0, 0, 128));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        leftPanel.setOpaque(false);

        //login data panel
        loginDataPanel = new LoginData().getLoginDataPanel();

        //resizable image
        textImageLbl = new ImageResizer("res/login_text_image (2).png");

    }
}
