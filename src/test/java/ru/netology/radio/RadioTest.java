package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // проверки для переключения радиостанций
    @Test
    public void shouldSetStation() { // проверка включения требуемой радиостанции
        Radio station = new Radio();

        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAbove9() { // проверка невключения станции больше 9
        Radio station = new Radio();

        station.setCurrentStation(9); // устанавливаем начальное значение, иначе получим 0
        station.setCurrentStation(10); // устанавливаем значение больше 9

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnder0() { // проверка невключения станции ниже 0
        Radio station = new Radio();

        station.setCurrentStation(0); // устанавливаем начальное значение
        station.setCurrentStation(-1); // устанавливаем значение ниже 0

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() { // проверка включения следующей станции
        Radio station = new Radio();

        station.setCurrentStation(5);
        station.nextStation();

        int expected = 6;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoFrom9To0() { // проверка переключения с 9 на 0 станцию
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() { // проверка включения предыдущей станции
        Radio station = new Radio();

        station.setCurrentStation(5);
        station.prevStation();

        int expected = 4;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoFrom0To9() { // проверка переключения с 0 на 9 станцию
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // проверки для громкости звука
    @Test
    public void shouldSetVolume() { // проверка включения звука определённой громкости
        Radio volume = new Radio();

        volume.setCurrentVolume(50);

        int expected = 50;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBy1() { // проверка увеличения громкости звука на 1
        Radio volume = new Radio();

        volume.setCurrentVolume(50);
        volume.increaseVolume();

        int expected = 51;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAbove100() { // проверка невозможности увеличения звука выше 100
        Radio volume = new Radio();

        volume.setCurrentVolume(101);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBy1() { // проверка уменьшения громкости звука на 1
        Radio volume = new Radio();

        volume.setCurrentVolume(50);
        volume.decreaseVolume();

        int expected = 49;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeUnder0() { // проверка невозможности уменьшения громкости звука ниже 0
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}