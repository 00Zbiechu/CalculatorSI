package model;

public class TimeModel {

    public double convertSecondsIntoMinutes(double in){

        return in*60;

    }

    public double convertSecondsIntoHours(double in){

        return in*3600;

    }

    public double convertSecondsIntoWeeks(double in){

        return in*86400;

    }

    public double convertSecondsIntoYears(double in){

        return in*31536000;

    }

}
