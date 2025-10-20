package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio station = new Radio(20);
    Radio volume = new Radio(20);

    // проверяем конструкторы
    @Test
    public void shouldSetNumbersOfStations() {

        Assertions.assertEquals(20, station.getNumbersOfStations());
    }

    // проверки для радиостанций
    @Test
    public void shouldGetFirstStation() { // проверка номера первой станции

        Assertions.assertEquals(0, station.getFirstStation());
    }

    @Test
    public void shouldGetNumbersOfStations() { // проверка количества радиостанций

        Assertions.assertEquals(20, station.getNumbersOfStations());
    }

    @Test
    public void shouldGetFinalStation() { // проверка номера последней станции по умолчанию

        Assertions.assertEquals(19, station.getFinalStation());
    }

    @Test
    public void shouldSetStation() { // проверка включения требуемой радиостанции

        station.setCurrentStation(15);

        Assertions.assertEquals(15, station.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationAboveFinal() { // проверка невключения станции дальше последней

        station.setCurrentStation(5); // устанавливаем начальное значение
        station.setCurrentStation(20); // устанавливаем значение больше 9

        Assertions.assertEquals(5, station.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationUnder0() { // проверка невключения станции ниже 0

        station.setCurrentStation(0); // устанавливаем начальное значение
        station.setCurrentStation(-1); // устанавливаем значение ниже 0

        Assertions.assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() { // проверка включения следующей станции

        station.setCurrentStation(5);
        station.nextStation();

        Assertions.assertEquals(6, station.getCurrentStation());
    }

    @Test
    public void shouldGoFromFinalTo0() { // проверка переключения с последней на 0 станцию

        station.setCurrentStation(19);
        station.nextStation();

        Assertions.assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() { // проверка включения предыдущей станции

        station.setCurrentStation(5);
        station.prevStation();

        Assertions.assertEquals(4, station.getCurrentStation());
    }

    @Test
    public void shouldGoFrom0ToFinal() { // проверка переключения с 0 на последнюю станцию

        station.setCurrentStation(0);
        station.prevStation();

        Assertions.assertEquals(19, station.getCurrentStation());
    }

    // проверки для громкости звука
    @Test
    public void shouldGetLowestVolume() { // проверка минимального уровня громкости

        Assertions.assertEquals(0, volume.getLowestVolume());
    }

    @Test
    public void shouldGetHighestVolume() { // проверка максимального уровня громкости

        Assertions.assertEquals(100, volume.getHighestVolume());
    }

    @Test
    public void shouldSetVolume() { // проверка включения звука определённой громкости

        volume.setCurrentVolume(50);

        Assertions.assertEquals(50, volume.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeBy1() { // проверка увеличения громкости звука на 1

        volume.setCurrentVolume(50);
        volume.increaseVolume();

        Assertions.assertEquals(51, volume.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeAbove100() { // проверка невозможности увеличения звука выше 100

        volume.setCurrentVolume(101);
        volume.increaseVolume();

        Assertions.assertEquals(100, volume.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeBy1() { // проверка уменьшения громкости звука на 1

        volume.setCurrentVolume(50);
        volume.decreaseVolume();

        Assertions.assertEquals(49, volume.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeUnder0() { // проверка невозможности уменьшения громкости звука ниже 0

        volume.setCurrentVolume(-1);
        volume.decreaseVolume();

        Assertions.assertEquals(0, volume.getCurrentVolume());
    }
}