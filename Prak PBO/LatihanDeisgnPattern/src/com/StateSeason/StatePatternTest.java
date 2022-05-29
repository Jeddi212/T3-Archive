package com.StateSeason;

public class StatePatternTest {

    public static void main(String[] args) {
        SeasonContext seasonContext = new SeasonContext();
        seasonContext.nextSeason();
        seasonContext.nextSeason();
        seasonContext.nextSeason();

        System.out.println("");
        System.out.println("Start from Monsoon");
        seasonContext.setSeason(new Monsoon());
        seasonContext.nextSeason();
        seasonContext.nextSeason();

    }

}
