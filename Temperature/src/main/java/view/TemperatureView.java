package view;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.Serializable;

@Getter
@Setter
public class TemperatureView extends JPanel implements Serializable {

    private JPanel panel;
    private JTextField textField;
    private JLabel label;
    private String [] listOfItemsForComboBox = {"kelvin","Celsius","Farhenheit"};
    private JComboBox<String> comboBox;

    private JButton button;

    public TemperatureView(){
        initGUI();
    }

    private void initGUI(){

        createPanel();
        createTextFiled();
        createSelectField();
        createButton();

    }

    private void createPanel(){

        panel = new JPanel();
        add(panel);

    }

    private void createTextFiled(){

        textField = new JTextField();
        label = new JLabel("temp(Celsius)");
        textField.setColumns(5);
        panel.add(label);
        panel.add(textField);

    }

    private void createSelectField(){

        comboBox = new JComboBox<>();

        for(String listItem : listOfItemsForComboBox){
            comboBox.addItem(listItem);
        }

        panel.add(comboBox);

    }

    private void createButton(){

        button = new JButton("Oblicz");

        panel.add(button);

    }

    public void addActionListener(ActionListener actionListener){

        textField.addActionListener(actionListener);
        comboBox.addActionListener(actionListener);
        button.addActionListener(actionListener);

    }

}
