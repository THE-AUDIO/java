/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package come.mycompany.game;

import com.mycompany.game.card.Deck;
import com.mycompany.gameController.GameController;
import com.mycompany.vew.View;

/**
 *
 * @author nandraina
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        GameController gc = new GameController(new Deck() , new View());
        gc.run();
    }
}   
