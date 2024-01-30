package com.example.archery.entities;

import java.util.Comparator;

public class PlayerCirlcleHit extends BaseEntity {
    private final String playerName;
	private final String circleName;
    private final String roundName;
    private final String teamName;

    
    public PlayerCirlcleHit(String teamName, String playerName, String circleName, String roundName) {
        this.teamName = teamName;
        this.playerName = playerName;
        this.circleName = circleName;
        this.roundName = roundName;
    }


    public PlayerCirlcleHit(String id, String teamName, String playerName, String circleName, String roundName) {
        this.id=id;
        this.teamName = teamName;
        this.playerName = playerName;
        this.circleName = circleName;
        this.roundName = roundName;
    }


    public String getTeamName() {
        return teamName;
    }

    public String getPlayerName() {
        return playerName;
    }


    public String getCircleName() {
        return circleName;
    }


    public String getRoundName() {
        return roundName;
    }


    @Override
    public String toString() {
        return "PlayerCirlcleHit [playerName=" + playerName + ", circleName=" + circleName + ", roundName=" + roundName
                + "]";
    }

    class SortPlayerById implements Comparator<PlayerCirlcleHit> {
 
        // Method
        // Sorting in ascending order of roll number
        public int compare(PlayerCirlcleHit a, PlayerCirlcleHit b)
        {
            Integer a1=Integer.parseInt(a.getId());
            Integer b1=Integer.parseInt(b.getId());
            return a1 - b1;
        }
    }

}
