package ru.maxryazan.converter.measure;


public class BritishCentner extends Measure {


    @Override
    public double convertToGram(double weight) {
        return (weight * 50802.345);
    }

    @Override
    public double convertToKilo(double weight) {
        return (weight * 50.802345);
    }

    @Override
    public double convertToCentner(double weight) {
        return (weight * 0.50802345);
    }

    @Override
    public double convertToTon(double weight) {
        return (weight * 0.050802345);
    }
}
