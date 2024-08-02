/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.game.card;

/**
 *
 * @author nandraina
 */
public enum Suit {
    
    DIAMONDS (1) ,
    HEARTS (2) ,
    SPADE (3) , 
    CLUB (4);
    
    int suit ;
    private Suit(int value){
        this.suit = value;
    }
    
    public int value(){
        return suit ;
    }
}   
