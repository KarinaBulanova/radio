package org.example;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;
    private int maxStation;


    public Radio() {
        this.maxStation = 9;

    }

    public Radio(int stationCount) {
        this.maxStation = stationCount - 1;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber != maxStation) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        if (currentRadioStationNumber != 0) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = maxStation;
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
