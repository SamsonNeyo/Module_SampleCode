package musiccatalogue.ui;

import javax.swing.*;
import java.awt.*;

public class CategoryPanel extends JPanel {
    public CategoryPanel() {
        setLayout(new GridLayout(3, 1));
        setBackground(Color.DARK_GRAY);

        String[] categories = {"Rap", "Reggae", "Ballads"};
        for (String category : categories) {
            JButton button = new JButton(category);
            button.setForeground(Color.WHITE);
            button.setBackground(Color.DARK_GRAY);
            add(button);
        }
    }
}
