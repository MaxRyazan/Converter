package ru.maxryazan.converter.measure;


public class Ounce extends Measure {

    @Override
    public double convertToGram(double weight) {
        return (weight * 28.35);
    }

    @Override
    public double convertToKilo(double weight) {
        return (weight * 0.2835);
    }

    @Override
    public double convertToCentner(double weight) {
        return (weight * 0.0002835);
    }

    @Override
    public double convertToTon(double weight) {
        return (weight * 0.00002835);
    }
}
