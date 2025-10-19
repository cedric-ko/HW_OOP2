package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    // поля инициализации для радиостанций
    private int firstStation = 0;
    private int numbersOfStations = 10;
    private int finalStation = firstStation + numbersOfStations - 1;
    private int currentStation = firstStation; // номер текущей радиостанции

    // поля инициализации для громкости звука
    private int lowestVolume = 0;
    private int highestVolume = 100;
    private int currentVolume = lowestVolume + 10; // текущей уровень громкости звука

    // настройки радиостанций
    public void putNewStation(int newStation) { // включение новой радиостанции
        if (newStation < firstStation) {
            return;
        }
        if (newStation > finalStation) {
            return;
        }
        currentStation = newStation;
    }

    public void nextStation() { // метод переключения на следующую станцию
        if (currentStation < finalStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = firstStation;
        }
    }

    public void prevStation() { // метод переключения на предыдущую станцию
        if (currentStation > firstStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = finalStation;
        }
    }

    // настройки громкости звука
    public void increaseVolume() { // метод увеличения громкости звука на 1
        if (currentVolume < highestVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() { // метод уменьшения громкости звука на 1
        if (currentVolume > lowestVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
