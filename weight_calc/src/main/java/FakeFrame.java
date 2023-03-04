import controller.WeightController;
import view.WeightView;

import javax.swing.*;

public class FakeFrame extends JFrame {

    public FakeFrame(){

        WeightController weightController = new WeightController();

        add(weightController.getWeightView());
    }

}
