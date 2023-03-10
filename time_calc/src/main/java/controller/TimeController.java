package controller;

import lombok.Getter;
import lombok.Setter;
import model.TimeModel;
import view.TimeView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Getter
@Setter
public class TimeController {

    private final TimeView weightView;
    private final TimeModel weightModel;

    double result;

    public TimeController(){

        weightModel = new TimeModel();
        weightView = new TimeView();
            weightView.addActionListener(new ActionListenerForWeightView());

    }

    private class ActionListenerForWeightView implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource().equals(weightView.getButton()) && !weightView.getTextField().getText().isEmpty()){

                if(weightView.getComboBox().getSelectedIndex()==0){
                    result = weightModel.convertSecondsIntoMinutes(Double.parseDouble(weightView.getTextField().getText()));
                    System.out.println(result);

                }else if(weightView.getComboBox().getSelectedIndex()==1) {
                    result = weightModel.convertSecondsIntoHours(Double.parseDouble(weightView.getTextField().getText()));
                    System.out.println(result);

                }else if(weightView.getComboBox().getSelectedIndex()==2) {
                    result = weightModel.convertSecondsIntoYears(Double.parseDouble(weightView.getTextField().getText()));
                    System.out.println(result);

                } else if(weightView.getComboBox().getSelectedIndex()==3) {
                    result = weightModel.convertSecondsIntoWeeks(Double.parseDouble(weightView.getTextField().getText()));
                    System.out.println(result);

                }

            }


        }
    }

}
