package com.cricketcardbattle.model;

public class CricketPlayer {

    private String id;
    private String name;
    private String country;
    private Integer totalRuns;
    private Integer centuries;
    private Integer totalWickets;
    private Double battingAverage;
    private Double strikeRate;
    private Double bowlingAverage;
    private Double economyRate;
    private Integer bestBowlingWickets;
    private Integer bestBowlingRuns;

    public CricketPlayer(
            String id, String name, String country,
            Integer totalRuns, Integer centuries, Integer totalWickets,
            Double battingAverage, Double strikeRate,
            Double bowlingAverage, Double economyRate,
            Integer bestBowlingWickets, Integer bestBowlingRuns
    ) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.totalRuns = totalRuns;
        this.centuries = centuries;
        this.totalWickets = totalWickets;
        this.battingAverage = battingAverage;
        this.strikeRate = strikeRate;
        this.bowlingAverage = bowlingAverage;
        this.economyRate = economyRate;
        this.bestBowlingWickets = bestBowlingWickets;
        this.bestBowlingRuns = bestBowlingRuns;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Integer getTotalRuns() {
        return totalRuns;
    }

    public Integer getCenturies() {
        return centuries;
    }

    public Integer getTotalWickets() {
        return totalWickets;
    }

    public Double getBattingAverage() {
        return battingAverage;
    }

    public Double getStrikeRate() {
        return strikeRate;
    }

    public Double getBowlingAverage() {
        return bowlingAverage;
    }

    public Double getEconomyRate() {
        return economyRate;
    }

    public Integer getBestBowlingWickets() {
        return bestBowlingWickets;
    }

    public Integer getBestBowlingRuns() {
        return bestBowlingRuns;
    }
}
