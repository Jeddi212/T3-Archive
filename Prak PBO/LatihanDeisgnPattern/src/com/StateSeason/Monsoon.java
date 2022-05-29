package com.StateSeason;

public class Monsoon implements Season {

    @Override
    public void nextSeason(SeasonContext seasonContext) {
        System.out.println("Monsoon season is running");
        seasonContext.setSeason(new Winter());
    }
}
