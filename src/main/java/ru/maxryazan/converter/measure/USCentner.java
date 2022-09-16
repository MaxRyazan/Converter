package ru.maxryazan.converter.measure;


public class USCentner extends Measure {


    @Override
    public double convertToGram(double weight) {
        return (weight * 45359.237);
    }

    @Override
    public double convertToKilo(double weight) {
        return (weight * 45.359237);
    }

    @Override
    public double convertToCentner(double weight) {
        return (weight * 0.45359237);
    }

    @Override
    public double convertToTon(double weight) {
        return (weight * 0.045359237);
    }
}
