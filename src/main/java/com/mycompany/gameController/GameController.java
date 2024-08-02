/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/package-info.java to edit this template
 */
package com.mycompany.gameController;

import com.mycompany.game.card.Deck;
import com.mycompany.game.card.Hand;
import com.mycompany.game.card.Players;
import com.mycompany.game.card.PlayingCard;
import com.mycompany.vew.View;

import java.util.ArrayList;
import java.util.List;

public class GameController{

    enum GameState {
        addingPlayer, DealtCard, WinnerReveled
    }
    
    Deck deck;
    List<Players> players;
    Players winner;
    Hand hand;
    View view;
    GameState gameState;
    
    public GameController(Deck deck,  View view){
        super();
        this.deck = deck;
        this.players = new ArrayList<Players>();
        this.gameState = GameState.addingPlayer;
        this.view = view;         
    }
    
    public void run(){
        if(gameState == GameState.addingPlayer){
            view.promptForPlayerName();
        }
        switch(gameState){
            case DealtCard -> view.promptForFlip();
            case WinnerReveled -> view.promptNewGame();
        }
                
    }
    
    public void addPlayer(String namePlayer){
        if(gameState == GameState.DealtCard){
            players.add(new Players(namePlayer));
            view.showPlayerName(players.size(), namePlayer);
        }
    }
    public void startGame(){
        if(gameState != GameState.DealtCard){
            deck.shufle();
            int playerIndex = 1;
            for(Players player: players){
                player.addCardHand(deck.removeTopCard());
                view.showFaceDownCardForPlayer(playerIndex++, player.getName());
                
            }
            gameState = GameState.DealtCard;
            
        }
        this.run();
    }
    public void flipCard(){
        for(Players player: players){
            int playerIndex = 1 ;
            PlayingCard pc = player.getCard(0);
            pc.flip();
            view.showCardForPlayer(playerIndex++, player.getName(), pc.getRank().toString(), pc.getSuit().toString());
        }
        evaluateWinner();
        displayWinner();
        rebuildDeck();
        gameState = GameState.WinnerReveled;
        this.run();
    }
    void evaluateWinner(){
        Players bestPlayer = null;
        int bestRank = -1;
        int bestSuit = -1;
        for(Players player: players){
            boolean newBestPlayer = false;
            if(bestPlayer == null){
                newBestPlayer = true;
            } else{
                PlayingCard pc = player.getCard(0);
                int thisRank = pc.getRank().value();
                if(thisRank >= bestRank){
                    if(thisRank > bestRank){
                          newBestPlayer = true;
                    } else{
                        if(pc.getSuit().value() > bestSuit){
                            newBestPlayer = true;
                        }
                    }
                }
            }
            if(newBestPlayer){
                bestPlayer = player;
                PlayingCard pc = player.getCard(0);
                bestRank = pc.getRank().value();
                bestSuit = pc.getSuit().value();
            }
        }
         winner = bestPlayer;
    }
    void displayWinner(){
        view.showWhinner(winner.getName());
    }
    void rebuildDeck(){
        for(Players player: players){
            deck.returnCardToDeck(player.removeCardHand());
        }
    }
}