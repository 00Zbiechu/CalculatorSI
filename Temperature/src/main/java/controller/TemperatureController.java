package controller;

import lombok.Getter;
import lombok.Setter;
import model.TemperatureModel;
import view.TemperatureView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

@Getter
@Setter
public class TemperatureController {

    private final TemperatureView temperatureView;
    private final TemperatureModel temperatureModel;

    double result;

    public TemperatureController(){

        temperatureModel = new TemperatureModel();
        temperatureView = new TemperatureView();
        temperatureView.addActionListener(new ActionListenerForTemperatureView());

    }

    private class ActionListenerForTemperatureView implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource().equals(temperatureView.getButton()) && !temperatureView.getTextField().getText().isEmpty()){

                if(temperatureView.getComboBox().getSelectedIndex()==0){
                    result = temperatureModel.celsiusToKelvin(Double.parseDouble(temperatureView.getTextField().getText()));
                    System.out.println(result);

                }else if(temperatureView.getComboBox().getSelectedIndex()==1) {
                    result = temperatureModel.celsiusToCentigrade(Double.parseDouble(temperatureView.getTextField().getText()));
                    System.out.println(result);

                }else if(temperatureView.getComboBox().getSelectedIndex()==2) {
                    result = temperatureModel.celsiusToFahrenheit(Double.parseDouble(temperatureView.getTextField().getText()));
                    System.out.println(result);

                }

            }


        }
    }

}
