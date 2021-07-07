package com.zss.扑克牌;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
    private String suit; //suit表示扑克牌的花色
    private String rank;//rank表示扑克牌的点数

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "["+this.suit+this.rank+"]";
    }
}
public class TestDemo {
    private static List<Card> buildPoker(){
        List<Card> pokers = new ArrayList<>();
        String[] suits = {"♣","♦","♥","♠"};
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 10; j++) {
                //像扑克牌中添加2-10各种花色的牌
             pokers.add(new Card(""+suits[i],""+j));
            }
            pokers.add(new Card(""+suits[i],"J"));
            pokers.add(new Card(""+suits[i],"Q"));
            pokers.add(new Card(""+suits[i],"K"));
            pokers.add(new Card(""+suits[i],"A"));
        }
       return pokers;
    }
    public static void main(String[] args) {
        //1、生成一副扑克牌
        List<Card> pokers = buildPoker();
       //2、洗牌
       Collections.shuffle(pokers);
       //3、发牌，假设有4个玩家，每人5张牌
        List<List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int card = 0; card < 5; card++) {
            for (int player = 0; player < 4; player++) {
                List<Card> play = players.get(player);
                play.add(pokers.remove(0));
            }
        }
        //打印玩家手牌
        for (int i = 0; i < players.size(); i++) {
            System.out.println("玩家"+i+"的手牌为:"+players.get(i));
        }
    }
}
