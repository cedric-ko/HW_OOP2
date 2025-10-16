package ru.netology.radio;

public class Radio {

    public int currentStation; // это поле хранит номер текущей радиостанции
    public int currentVolume; // это поле хранит текущей уровень громкости звука

    // настройки радиостанций
    public int getCurrentStation() { // геттер для текущей станции
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) { // сеттер для радиостанции
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() { // метод переключения на следующую станцию
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() { // метод переключения на предыдущую станцию
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    // настройки громкости звука
    public int getCurrentVolume() { // геттер для текущего уровня громкости звука
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { // сеттер для уровня громкости звука
        if (newCurrentVolume < 0) { // минимум громкости ограничен 0
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) { // максимум громкости ограничен 100
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() { // метод увеличения громкости звука на 1
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() { // метод уменьшения громкости звука на 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
