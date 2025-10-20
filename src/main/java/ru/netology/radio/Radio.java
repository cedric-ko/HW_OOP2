package ru.netology.radio;

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

    // конструкторы
    public Radio(int numbersOfStations) { // конструктор для выбора количества радиостанций
        this.numbersOfStations = numbersOfStations;
        this.finalStation = firstStation + numbersOfStations - 1;
    }

    public Radio() { // конструктор для количества станций по умолчанию

    }

    // настройки радиостанций
    public int getFirstStation() { // геттер для первой станции диапазона
        return firstStation;
    }

    public int getNumbersOfStations() { // геттер для количества радиостанций
        return numbersOfStations;
    }

    public int getFinalStation() { // геттер для последней станции
        return finalStation;
    }

    public int getCurrentStation() { // геттер для текущей станции
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) { // сеттер для радиостанции
        if (newCurrentStation < firstStation) {
            return;
        }
        if (newCurrentStation > finalStation) {
            return;
        }
        currentStation = newCurrentStation;
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
    public int getLowestVolume() { // геттер для минимального уровня громкости звука
        return lowestVolume;
    }

    public int getHighestVolume() { // геттер для максимального уровня громкости звука
        return highestVolume;
    }

    public int getCurrentVolume() { // геттер для текущего уровня громкости звука
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { // сеттер для уровня громкости звука
        if (newCurrentVolume < lowestVolume) { // ограничение минимума громкости
            newCurrentVolume = lowestVolume;
        }
        if (newCurrentVolume > highestVolume) { // ограничение максимума громкости
            newCurrentVolume = highestVolume;
        }
        currentVolume = newCurrentVolume;
    }

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
