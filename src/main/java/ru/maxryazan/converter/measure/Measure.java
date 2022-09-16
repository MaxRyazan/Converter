package ru.maxryazan.converter.measure;


public abstract class Measure {

    public abstract double convertToGram(double weight);
    public abstract double convertToKilo(double weight);
    public abstract double convertToCentner(double weight);
    public abstract double convertToTon(double weight);
}
