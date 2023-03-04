package controller;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import model.WeightModel;
import view.WeightView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Getter
@Setter
public class WeightController {

    private final WeightView weightView;
    private final WeightModel weightModel;

    double result;

    public WeightController(){

        weightModel = new WeightModel();
        weightView = new WeightView();
            weightView.addActionListener(new ActionListenerForWeightView());

    }

    private class ActionListenerForWeightView implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource().equals(weightView.getButton()) && !weightView.getTextField().getText().isEmpty()){

                if(weightView.getComboBox().getSelectedIndex()==0){
                    result = weightModel.convertGramsIntoKilos(Double.parseDouble(weightView.getTextField().getText()));
                    System.out.println(result);

                }else if(weightView.getComboBox().getSelectedIndex()==1) {
                    result = weightModel.convertGramsIntoDecagram(Double.parseDouble(weightView.getTextField().getText()));
                    System.out.println(result);

                }else if(weightView.getComboBox().getSelectedIndex()==2) {
                    result = weightModel.convertGramsIntoPound(Double.parseDouble(weightView.getTextField().getText()));
                    System.out.println(result);

                } else if(weightView.getComboBox().getSelectedIndex()==3) {
                    result = weightModel.convertGramsIntoOunce(Double.parseDouble(weightView.getTextField().getText()));
                    System.out.println(result);

                }

            }


        }
    }

}
