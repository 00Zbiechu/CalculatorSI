import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LengthConverter extends JFrame implements ActionListener {

    private JLabel lengthLabel, resultLabel;
    private JTextField lengthField, resultField;
    private JButton convertButton;
    private JComboBox<String> unitComboBox;

    public LengthConverter() {
        setTitle("Length Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels
        lengthLabel = new JLabel("Length in meters:");
        resultLabel = new JLabel("Result:");

        // Create text fields
        lengthField = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        // Create button
        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        // Create combo box
        String[] unitOptions = {"Kilometers", "Miles", "Feet"};
        unitComboBox = new JComboBox<>(unitOptions);

        // Create panels
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        inputPanel.add(lengthLabel);
        inputPanel.add(lengthField);
        inputPanel.add(new JLabel()); // spacer
        inputPanel.add(unitComboBox);

        JPanel outputPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        outputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        outputPanel.add(resultLabel);
        outputPanel.add(resultField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        buttonPanel.add(convertButton);

        // Add panels to content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(outputPanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        // Convert length to selected unit
        double length = Double.parseDouble(lengthField.getText());
        double result = 0;
        String selectedUnit = (String) unitComboBox.getSelectedItem();
        switch (selectedUnit) {
            case "Kilometers":
                result = length / 1000;
                break;
            case "Miles":
                result = length / 1609.344;
                break;
            case "Feet":
                result = length / 0.3048;
                break;
        }

        // Display result
        resultField.setText(String.format("%.2f", result));
    }

    public static void main(String[] args) {
        LengthConverter converter = new LengthConverter();
        converter.setVisible(true);
    }
}
