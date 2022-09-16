package ru.maxryazan.converter.measure;


public class Pound extends Measure {

    @Override
    public double convertToGram(double weight) {
        return (weight * 453.592);
    }

    @Override
    public double convertToKilo(double weight) {
        return (weight * 0.453);
    }

    @Override
    public double convertToCentner(double weight) {
        return (weight * 0.00453);
    }

    @Override
    public double convertToTon(double weight) {
        return (weight * 0.000453);
    }
}
