package musiccatalogue.ui;

import javax.swing.*;
import java.awt.*;

public class TitlePanel extends JPanel {
    public TitlePanel() {
        setBackground(Color.DARK_GRAY);
        JLabel titleLabel = new JLabel("My Music Catalogue");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel);
    }
}
