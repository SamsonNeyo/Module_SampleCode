package musiccatalogue.ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("My Music Catalogue");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Add panels
        add(new TitlePanel(), BorderLayout.NORTH);
        add(new CategoryPanel(), BorderLayout.WEST);
        add(new FormPanel(), BorderLayout.CENTER);
        add(new ButtonPanel(), BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
