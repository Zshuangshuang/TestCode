package com.zss.扑克牌;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card{
    public String rank;
    public String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
}
public class TestDemo {
    private static List<Card> buildPoker(){
        List<Card> poker = new ArrayList<>();
        String[] suits = {"♥","♠","♦","♣"};
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 10; j++) {
               poker.add(new Card(""+suits[i],""+j));
            }
            poker.add(new Card(""+suits[i],"J"));
            poker.add(new Card(""+suits[i],"Q"));
            poker.add(new Card(""+suits[i],"K"));
            poker.add(new Card(""+suits[i],"A"));
        }
        return poker;
    }
    public static void main(String[] args) {
        List<Card> poker = buildPoker();
        Collections.shuffle(poker);
        List<List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                players.get(j).add(poker.remove(0));
            }
        }
    }
}
