import controller.TemperatureController;
import view.TemperatureView;

import javax.swing.*;
import java.awt.*;

public class FakeFrame extends JFrame {

    public FakeFrame(){

        TemperatureController temperatureController = new TemperatureController();
        add(temperatureController.getTemperatureView());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(new Dimension(400,300));
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
