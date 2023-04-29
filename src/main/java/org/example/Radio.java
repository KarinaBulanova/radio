package org.example;

public class Radio {
    private int currentRadioStationNumber;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    private int currentVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber != 9) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        if (currentRadioStationNumber != 0) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


}
