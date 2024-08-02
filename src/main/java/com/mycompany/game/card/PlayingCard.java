/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game.card;

/**
 *
 * @author nandraina
 */
public class PlayingCard {
    private Rank rank;
    private Suit suit;
    private Boolean faceUp;
    
    
    public PlayingCard(Rank rank, Suit suit){
        super();
        this.rank = rank;
        this.suit = suit;
    }
    
    public Rank getRank(){
        return this.rank;
    }
    public Suit getSuit(){
        return this.suit;
    }
    
    public boolean flip(){
        this.faceUp = !this.faceUp;
        return this.faceUp;
    }
    
    public boolean isFaceUp(){
       return this.faceUp;  
    }
    
}
