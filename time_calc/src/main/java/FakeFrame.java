import controller.TimeController;

import javax.swing.*;

public class FakeFrame extends JFrame {

    public FakeFrame(){

        TimeController weightController = new TimeController();

        add(weightController.getWeightView());
    }

}
