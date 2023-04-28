package app.ui.customs;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundPanel extends JPanel {
    private Shape shape;
    private int arcWidth = 40;
    private int arcHeight = 40;

    /**
     * Constructs a new RoundPanel object with opaque set to false.
     */
    public RoundPanel() {
        super();
        setOpaque(false);
    }
    /**
     * Paints the component's background with a rounded rectangular shape and then calls
     * the super class's paintComponent() method to paint the component's text.
     *
     * @param g the Graphics context to use for painting
     */
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, arcWidth, arcHeight);
        super.paintComponent(g);
    }
    /**
     * Paints the component's border with a rounded rectangular shape.
     *
     * @param g the Graphics context to use for painting
     */
    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.setColor(getBackground());
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, arcWidth, arcHeight);
    }
    /**
     * Checks if the specified point is contained within the rounded rectangular shape of the component.
     *
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     * @return true if the point is contained within the shape of the component, false otherwise
     */
    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, arcWidth, arcHeight);
        }
        return shape.contains(x, y);
    }
}
