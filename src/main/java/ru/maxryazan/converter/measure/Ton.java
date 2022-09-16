package ru.maxryazan.converter.measure;


public class Ton extends Measure {

    @Override
    public double convertToGram(double weight) {
        return weight * 1000000;
    }

    @Override
    public double convertToKilo(double weight) {
        return weight * 1000;
    }

    @Override
    public double convertToCentner(double weight) {
        return weight * 10;
    }

    @Override
    public double convertToTon(double weight) {
        return weight;
    }
}
