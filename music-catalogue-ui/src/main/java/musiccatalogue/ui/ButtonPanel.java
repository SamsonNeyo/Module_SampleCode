package musiccatalogue.ui;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    public ButtonPanel() {
        setBackground(Color.GRAY);
        JButton submitButton = new JButton("Submit");
        JButton exitButton = new JButton("Exit");

        submitButton.setBackground(Color.DARK_GRAY);
        submitButton.setForeground(Color.WHITE);
        exitButton.setBackground(Color.DARK_GRAY);
        exitButton.setForeground(Color.WHITE);



        exitButton.addActionListener(e -> System.exit(0));

        add(submitButton);
        add(exitButton);
    }
}
