package musiccatalogue.ui;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {
    private JTextField artistField, studioField;
    private JComboBox<String> categoryBox;
    private JCheckBox availableCheckBox;

    public FormPanel() {
        setLayout(new GridLayout(4, 2));
        setBackground(Color.LIGHT_GRAY);

        add(new JLabel("Artist Name:"));
        artistField = new JTextField();
        add(artistField);

        add(new JLabel("Recording Studio:"));
        studioField = new JTextField();
        add(studioField);

        add(new JLabel("Category:"));
        categoryBox = new JComboBox<>(new String[]{"Rap", "Reggae", "Ballads"});
        add(categoryBox);

        availableCheckBox = new JCheckBox("Available");
        add(availableCheckBox);
    }
}
