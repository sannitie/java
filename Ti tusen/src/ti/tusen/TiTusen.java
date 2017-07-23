/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.tusen;

/**
 *
 * @author snorr
 */
public class TiTusen {

    /**
     * @param args the command line arguments
     *         gameOne.rollDice();
        gameOne.choseDice();
        gameOne.checkForMultiples();
        gameOne.checkForSingleDouble();
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        gameOne.play();
    }
    
}
