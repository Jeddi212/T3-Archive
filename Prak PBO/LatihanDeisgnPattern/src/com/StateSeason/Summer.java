package com.StateSeason;

public class Summer implements Season {

    @Override
    public void nextSeason(SeasonContext seasonContext) {
        System.out.println("Summer season is running");
        // Based on condition season (state) changes...
        seasonContext.setSeason(new Monsoon());
    }
}
