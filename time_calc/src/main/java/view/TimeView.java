package view;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.event.ActionListener;

@Getter
@Setter
public class TimeView extends JPanel {

    private JPanel panel;
    private JTextField textField;

    private String [] listOfItemsForComboBox = {"Minutes","Hours","Months","Years"};
    private JComboBox<String> comboBox;

    private JButton button;

    public TimeView(){

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
            textField.setColumns(5);
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
