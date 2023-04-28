package app.ui.login;

import app.ui.customs.ImagePanel;

import javax.swing.*;
import java.awt.*;

/**
 * This class represents the login window content.
 * It has a welcoming message on the left side and a translucent
 * panel on the right that contains the login input interface.
 * @author Daniel
 * @version 1.0
 */
public class LoginWindow {
    public JPanel contentPanel;//main panel
    private JPanel rightPanel;//left panel with login data
    private JPanel loginDataPanel;//panel with the login data
    private JPanel imagePanel;//resizable image with a welcoming message
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
        rightPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the background color with an alpha value
                g.setColor(new Color(0, 0, 0, 128));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        rightPanel.setOpaque(false);

        //login data panel
        loginDataPanel = new LoginData().getLoginDataPanel();

        //text (left part)
        imagePanel = new ImagePanel("res/login_text_image.png",new Dimension(500,500));
    }
}
