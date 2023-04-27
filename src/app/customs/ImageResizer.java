package app.customs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
* The ImageResizer class extends JLabel to display an image with resizing capabilities.
* The class provides methods to resize the image to fit the size of the JLabel.
* It also provides constructors that allow setting the size and path to the image file.
* @author Daniel
* @version 1.0
*/
public class ImageResizer extends JLabel {

    private String imagePath;//path to the image file
    /**
     *Constructs an ImageResizer object with a given image path and sets the default size to 500x500.
     *The image is resized to fit the size of the JLabel.
     *@param imagePath the path to the image file
     */
    public ImageResizer(String imagePath) {
        super();
        this.imagePath = imagePath;
        setSize(new Dimension(500,500));
        // Add a ComponentListener to the label to handle resize events
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent componentEvent) {
                resizeImage();
            }
        });

        // Resize the image initially
        resizeImage();
    }
    /**
     *Constructs an ImageResizer object with a given image path and size.
     *The image is resized to fit the size of the JLabel.
     *@param imagePath the path to the image file
     *@param dim the size of the JLabel
     */
    public ImageResizer(String imagePath,Dimension dim) {
        super();
        this.imagePath = imagePath;
        setSize(dim);
        // Add a ComponentListener to the label to handle resize events
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent componentEvent) {
                resizeImage();
            }
        });
    }

    /**
     *Resizes the image to fit the size of the JLabel and sets the image as the icon of the JLabel.
     *If the image cannot be read, an error message will be printed to the console.
     */
    private void resizeImage() {
        try {
            BufferedImage originalImage = ImageIO.read(new File(imagePath));
            Image scaledImage = originalImage.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
            setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
