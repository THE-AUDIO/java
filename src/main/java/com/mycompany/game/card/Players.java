/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game.card;

/**
 *
 * @author nandraina
 */
public class Players {
    private String name;
    private Hand hand;
    public Players(String name){
        super();
        this.name = name;
        hand = new Hand();
    }
    public void addCardHand(PlayingCard pc){
        hand.addCards(pc);
    }
    public PlayingCard getCard(int index){
       return hand.getCardIndex(index);
    }
   public  PlayingCard removeCardHand(){
       return hand.removeCard();
   }
   
   public String getName(){
       return name;
   }
}
