package view;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class TemperatureCustomization{
    public void setComponentBGColor(JComponent component, Color color){
        component.setBackground(color);
    }
    public void setComponentFontColor(JComponent component, Color color){
        component.setForeground(color);
    }
    public void setComponentFont(JComponent component, Font font){
        component.setFont(font);
    }
}
