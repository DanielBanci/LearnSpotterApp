package app.ui.main_window;

import app.ui.customs.RoundMenuBar;

import javax.swing.*;
import java.awt.*;

/**
 * This panel contains the menu bar.
 */
public class MenuPanel extends JPanel{
    private JMenuBar menuBar;
    private JMenuItem homeItem;
    private JMenuItem searchItem;
    private JMenuItem coursesItem;

    /**
     * Constructor that makes the panel with the menu display in the center.
     * It populates the menu bar with menus and item menus
     */
    public MenuPanel(){
        super();
        //this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        this.setLayout(new GridLayout(3,1));
        //menu bar
        menuBar = new RoundMenuBar();
        menuBar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        menuBar.setMinimumSize(new Dimension(170,20));

        //items
        homeItem = new JMenuItem("Home");
        homeItem.setOpaque(false);

        searchItem = new JMenuItem("Search");
        searchItem.setOpaque(false);

        coursesItem = new JMenuItem("Courses");
        coursesItem.setOpaque(false);

        menuBar.add(homeItem);
        menuBar.add(searchItem);
        menuBar.add(coursesItem);

        this.add(emptyPanel());
        this.add(menuBar);
        this.add(emptyPanel());
    }

    /**
     * Function that create a new transparent JPanel
     * @return a transparent JPanel
     */
    public JPanel emptyPanel(){
        JPanel p = new JPanel();
        p.setOpaque(false);
        p.setPreferredSize(new Dimension(1,1));

        return p;
    }

}
