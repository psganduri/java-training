package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PracticeDataStructures {
    public static void main (String [] args){

        String [] gamesPlayed =  {"Cricket","football"};
//gamesPlayed
        arrayUtility(gamesPlayed);


        ArrayList<String> teams = new ArrayList<>();
        listUtility(teams);

        HashMap<Integer,String> teamMembers = new HashMap<>();
        mapUtility(teamMembers);

    }

    public static void arrayUtility (String [] games){
        System.out.println("No of games: "+games.length);
        for (String game: games){
            System.out.println("Games Played are: "+game);
        }

    }

    public static void listUtility (ArrayList<String > teamNames){
        teamNames.add("AIA Knights");
        teamNames.add("AIA chargers");
        teamNames.add("team beta");
        System.out.println("No of teams in cricket are: "+teamNames.size());
        System.out.println("Removing one of the team");
        teamNames.remove(2);
        for(String tv: teamNames){
            System.out.println("Team Name selected is: "+tv);
        }


    }

    public static void mapUtility (HashMap<Integer,String> knightsPlayers){
        knightsPlayers.put(1,"Mohit");
        knightsPlayers.put(2,"Rizwan");
        knightsPlayers.put(3,"Rajesh");
        knightsPlayers.put(4,"Prem");
        for(int player: knightsPlayers.keySet()){
            System.out.println("Player number "+ player+" is: "+knightsPlayers.get(player));
        }
    }

}
