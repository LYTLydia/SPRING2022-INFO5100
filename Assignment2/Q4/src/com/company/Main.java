package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	Player lydia = new Player("Lydia", 8);
    Player judy = new Player("Judy", 6);
    Player lyric = new Player("Lyric",15);
    Player kiki = new Player("Kiki",13);
    Player diane = new Player("Diane", 4);
    Player alison = new Player("Alison", 13);

    Player[] players = {lydia,judy,lyric,kiki,diane,alison};

        Comparator<Player> comparator = new Comparator<Player>(){
            @Override
            public int compare(Player o1, Player o2) {
                if(o1.getScore()!=o2.getScore()){
                    return Integer.compare(o1.getScore(),o2.getScore());
                }else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
        };
    }
}
