package ru.maxryazan.converter.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.maxryazan.converter.measure.BritishCentner;
import ru.maxryazan.converter.measure.Measure;
import ru.maxryazan.converter.measure.Pound;


import static org.junit.jupiter.api.Assertions.*;

class ServiceClassTest {

    ServiceClass serviceClass;

    @BeforeEach
    public void setUp(){
        serviceClass = new ServiceClass();
    }

    @Test
    @DisplayName("Унция - килограмм")
    void execute1() {
        double really = serviceClass.execute(1, "Унция", "Килограмм");
        assertEquals(0.2835, really);
    }

    @Test
    @DisplayName("Фунт - килограмм")
    void execute2() {
        double really = serviceClass.execute(1, "Фунт", "Килограмм");
        assertEquals(0.453, really);
    }


    @Test
    @DisplayName("Стоун - килограмм")
    void execute3() {
        double really = serviceClass.execute(1, "Стоун", "Килограмм");
        assertEquals(5.669904625, really);
    }

    @Test
    @DisplayName("ЦентнерСША - килограмм")
    void execute4() {
        double really = serviceClass.execute(1, "ЦентнерСША", "Килограмм");
        assertEquals(45.359237, really);
    }

    @Test
    @DisplayName("ЦентнерАнгл - килограмм")
    void execute5() {
        double really = serviceClass.execute(1, "ЦентнерАнгл.", "Килограмм");
        assertEquals(50.802345, really);
    }

    @Test
    @DisplayName("Тонна - килограмм")
    void execute6() {
        double really = serviceClass.execute(1, "Тонна", "Килограмм");
        assertEquals(1000.0, really);
    }


    @Test
    @DisplayName("Тест фунта к грамму")
    void switchInputGram() {
        Measure pound = new Pound();
        double really = serviceClass.switchInput(pound, "Грамм", 1, 0);

        assertEquals(453.592, really);
    }

    @Test
    @DisplayName("Тест фунта к килограмму")
    void switchInputPound() {
        Measure pound = new Pound();
        double really = serviceClass.switchInput(pound, "Килограмм", 1, 0);

        assertEquals(0.453, really);
    }

    @Test
    @DisplayName("Тест британского центнера к килограмму")
    void switchInputCentnerEng() {
        Measure gbCentner = new BritishCentner();
        double really = serviceClass.switchInput(gbCentner, "Килограмм", 1, 0);

        assertEquals(50.802345, really);
    }

    @Test
    @DisplayName("Тест фунта к метрическому центнеру")
    void switchInputCentnerMetr() {
        Measure pound = new Pound();
        double really = serviceClass.switchInput(pound, "ЦентнерМетр.", 1, 0);

        assertEquals(0.00453, really);
    }
    @Test
    @DisplayName("Тест фунта к тонне")
    void switchInputTon() {
        Measure pound = new Pound();
        double really = serviceClass.switchInput(pound, "Тонна", 100, 0);

        assertEquals(0.0453, really);
    }
}