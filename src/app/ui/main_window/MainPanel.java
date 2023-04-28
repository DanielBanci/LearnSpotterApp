package app.ui.main_window;

import app.ui.customs.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * This class contains the main panel from the app.
 * It has a panel on top which has the logo on the left side
 * a search bar in the middle and the menu on the right.
 * The panel from the bottom part represents the content that
 * is currently displayed on the app.
 * @author Daniel
 * @version 1.0
 */
public class MainPanel {

    private JPanel supportPanel;//the panel that contains all the components
    private JPanel contentPanel;
    private JPanel topPanel;
    private JPanel menuPanel;
    private JTextField textFieldSearch;
    private JPanel searchBarPanel;
    private JPanel logoSupportPanel;
    private JPanel searchImagePanel;

    /**
     * Creates the UI components of the main panel.
     * The UI components include:
     * topPanel: a JPanel to hold the logo, search bar and menu
     * logoSupportPanel: a JPanel to hold the logo
     * menuPanel: a JPanel to hold the menu
     * searchBarPanel: a JPanel to hold the search bar and its icon
     * searchImagePanel: a JPanel to hold the search icon
     * textFieldSearch: a JTextField to hold the search text input
     */

    private void createUIComponents() {

        Border paddingBorder = BorderFactory.createEmptyBorder(30, 10, 30, 10);
        topPanel = new JPanel();
        topPanel.setBorder(paddingBorder);

        logoSupportPanel = new ImagePanel("res/logo.png",new Dimension(200,100));

        menuPanel = new MenuPanel();

        searchBarPanel = new RoundPanel();
        searchBarPanel.setBorder(new EmptyBorder(30,10,10,30));

        searchImagePanel = new ImagePanel("res/search_icon.png", new Dimension(20,20));

        textFieldSearch = new RoundTextField();

    }

    /**
     * @return the panel with all the components
     */
    public JPanel getSupportPanel() {
        return supportPanel;
    }
}
