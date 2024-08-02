/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game.card;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author nandraina
 */
public class Deck {
    private List<PlayingCard> cards;
    
    public Deck () {
        cards = new ArrayList<PlayingCard>();
        for(Rank rank: Rank.values()){
            for(Suit suit: Suit.values()){
                System.out.println("Creating Card [ "+ rank+" ] ["+suit+"]");
                cards.add(new PlayingCard(rank, suit));
            }
        }
    }
    public void shufle(){
        Random random = new Random();
        for(int i = 0 ; i < cards.size(); i ++){
            Collections.swap(cards, i, random.nextInt(cards.size()));
        }
    }
    public PlayingCard removeTopCard(){
        return cards.remove(0);
    }
    public void  returnCardToDeck(PlayingCard pc){
          cards.add(pc);
    }
    
    public List<PlayingCard> getCard(){
        return cards;
    }
}
