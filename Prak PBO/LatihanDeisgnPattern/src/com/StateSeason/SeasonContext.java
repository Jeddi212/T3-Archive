package com.StateSeason;

public class SeasonContext {
    Season season;

    public SeasonContext() {
        this.season = new Summer(); // Default
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void nextSeason() {
        this.season.nextSeason(this);
    }
}
