/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game.card;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandraina
 */
public class Hand {
    private List<PlayingCard> card;
    public Hand(){
        card = new ArrayList<PlayingCard>();
    }
    public void addCards(PlayingCard pc){
        card.add(pc) ;
    }
    public PlayingCard getCardIndex(int index){
      return  card.get(index);
    }
    public PlayingCard removeCard(){
        return card.remove(0);
    }
}
