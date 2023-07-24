package java3_asm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;


public class ImageUploadExample extends JFrame {
    private JLabel imageLabel;

    public ImageUploadExample() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Upload Example");
        setSize(400, 400);

        imageLabel = new JLabel("Click here to upload an image");
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add the MouseListener to the JLabel to handle click event
        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                uploadImage();
            }
        });

        getContentPane().add(imageLabel, BorderLayout.CENTER);
    }

    private void uploadImage() {
        JFileChooser fileChooser = new JFileChooser("D:\\hocky3\\java3\\Java3_asm\\src\\java3_asm\\icons");
        int returnValue = fileChooser.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            // Load the selected image and set it to the JLabel
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
            Image image = imageIcon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(image);
            imageLabel.setIcon(imageIcon);
            imageLabel.setText(""); // Clear the original text
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ImageUploadExample().setVisible(true);
        });
    }
}