/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/package-info.java to edit this template
 */
package com.mycompany.vew;

import com.mycompany.gameController.GameController;
import java.util.Scanner;

public class View {

    GameController controller;
    Scanner keyBoard = new Scanner(System.in);

    public void setController(GameController gc) {
        this.controller = gc;
    }

    ;
       public void promptForPlayerName() {
        System.out.println("Enter Player Name");
        String name = keyBoard.nextLine();
        if (name.isEmpty()) {
            controller.startGame();
        } else {
            controller.addPlayer(name);
        }
    }

    public void promptForFlip() {
        System.out.println("Pres Enter to reveal a cards");
        keyBoard.nextLine();
        controller.flipCard();
    }

    ;
       public void promptNewGame() {
        System.out.println("Press Enter to deal again");
        keyBoard.nextLine();
        controller.startGame();
    }

    ;

    public void showPlayerName(int indexPlayer, String playerName) {
        System.out.println("[" + indexPlayer + "] [" + playerName + "]");
        controller.startGame();
    }

    public void showFaceDownCardForPlayer(int indexPlayer, String playerName) {
        System.out.println("[" + indexPlayer + "] [" + playerName + "] [x][x]");
    }

    public void showCardForPlayer(int i, String playerName, String rank, String suit) {
        System.out.println("[" + i + "] [" + playerName + "] {" + rank + "] [" + suit + "]");
    }

    public void showWhinner(String name) {
        System.out.println("The Winner is " + name + " !!!");
    }
}
