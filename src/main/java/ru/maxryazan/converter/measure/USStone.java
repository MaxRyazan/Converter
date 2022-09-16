package ru.maxryazan.converter.measure;


public class USStone extends Measure {


    @Override
    public double convertToGram(double weight) {
        return (weight * 5669.904625);
    }

    @Override
    public double convertToKilo(double weight) {
        return (weight * 5.669904625);
    }

    @Override
    public double convertToCentner(double weight) {
        return (weight * 0.05669904625);
    }

    @Override
    public double convertToTon(double weight) {
        return (weight * 0.005669904625);
    }
}
