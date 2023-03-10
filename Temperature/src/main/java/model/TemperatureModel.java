package model;

import java.io.Serializable;

public class TemperatureModel{

    public double celsiusToKelvin(double in){

        return in+273.15;

    }

    public double celsiusToCentigrade(double in){

        return in;

    }

    public double celsiusToFahrenheit(double in){

        return in*2+30;

    }

}
