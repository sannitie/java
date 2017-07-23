/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.tusen;

import java.util.Scanner;

/**
 *
 * @author snorr
 */
public class Terning {

    private int faceValue;

    // constructor
    public Terning() {

    }

    public int roll() {
        faceValue = (int)(Math.random() * 6 + 1);
        return faceValue;
    }
}
