package ru.maxryazan.converter.service;

import org.springframework.stereotype.Service;
import ru.maxryazan.converter.measure.Measure;
import ru.maxryazan.converter.measure.*;

@Service
public class ServiceClass {

    Measure ounce = new Ounce();
    Measure pound = new Pound();
    Measure usStone = new USStone();
    Measure britishCenter = new BritishCentner();
    Measure usCenter = new USCentner();
    Measure ton = new Ton();

    public double execute(double count, String base, String into) {
        double result = 0;
        if (validate(count)) {
            switch (base) {
                case "Унция" -> result = switchInput(ounce, into, count, result);
                case "Фунт" -> result = switchInput(pound, into, count, result);
                case "Стоун" -> result = switchInput(usStone, into, count, result);
                case "ЦентнерСША" -> result = switchInput(usCenter, into, count, result);
                case "ЦентнерАнгл." -> result = switchInput(britishCenter, into, count, result);
                case "Тонна" -> result = switchInput(ton, into, count, result);
                }
            }
            return result;
        }

    private boolean validate(double count) {
        return count > 0;
    }

    public double switchInput(Measure measure, String into, double count, double result){
        switch (into) {
            case "Грамм" -> result = measure.convertToGram(count);
            case "Килограмм" -> result = measure.convertToKilo(count);
            case "ЦентнерМетр." -> result = measure.convertToCentner(count);
            case "Тонна" -> result = measure.convertToTon(count);
        }
        return result;
    }
}
