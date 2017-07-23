package ti.tusen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author snorr
 */
public class Game {

    private int numberOfDice = 6;
    private Scanner scanner;
    private ArrayList<Integer> templist;
    private ArrayList<Integer> chosen;
    private int score;
    private boolean playing = true;

    public Game() {
        templist = new ArrayList<>();
        chosen = new ArrayList<>();
    }

    public void rollDice() {
        Terning terning = new Terning();
        System.out.println();
        if (numberOfDice == 0) {
            numberOfDice = 6;
        }
        for (int i = 1; i <= numberOfDice; i++) {
            int tempDice = terning.roll();
            templist.add(tempDice);
            System.out.print(tempDice);
            if (i <= numberOfDice - 1) {
                System.out.print(" - ");
            }
        }
    }

    public void removeMultiples(int con) {
        int index = 0;

        while (index < chosen.size()) {
            int namecard = chosen.get(index);
            if (namecard == con) {
                chosen.remove(index);
            } else {
                index++;
            }
        }
    }

    public void checkForSingleDouble() {
        for (int i = 1; i < 6; i++) {
            if (i == 1) {
                score = score + (100 * Collections.frequency(chosen, 1));
                removeMultiples(1);
            }
            if (i == 5) {
                score = score + (50 * Collections.frequency(chosen, 5));
                removeMultiples(5);
            }
        }
    }

    public void checkForMultiples() {
        for (int i = 2; i <= 6; i++) {
            int occurences = Collections.frequency(chosen, i);
            if (occurences >= 3) {
                score = score + ((i * 100) * occurences);
                removeMultiples(i);
                numberOfDice = numberOfDice - occurences;
            }
        }
        int occurences = Collections.frequency(chosen, 1);
        if (occurences >= 3) {
            score = score + (1000 * occurences);
            removeMultiples(1);
            numberOfDice = numberOfDice - occurences;
        }
    }

    public void choseDice(int faceValue) {
        
    }

    public void choseDiceOLD() {
        scanner = new Scanner(System.in);
        System.out.println("\nChose any number of die you want to keep. Example: 3 3 3 1");
        /*for (int i = 0; i < numberOfDice; i++) {
            int myInt = scanner.nextInt();
            chosen.add(myInt);
            numberOfDice = numberOfDice - 1;
        }*/
        while (scanner.hasNextInt()) {
            int myInt = scanner.nextInt();
            chosen.add(myInt);
            numberOfDice = numberOfDice - 1;
            System.out.println("1");
            if (numberOfDice == 0) {
                scanner.reset();
            }
        }
        System.out.println(numberOfDice);
        scanner.close();
    }

    public void play() {
        while (playing) {
            System.out.println("\nPress enter to continue or type \"exit\" to stop playing.");
            scanner = new Scanner(System.in);
            String myString = scanner.nextLine();
            if (myString.contains("exit")) {
                break;
            }
            rollDice();
            scanner = new Scanner(System.in);
            System.out.println("\nChose a dice to keep or press enter to coninue.");
            int myInt = scanner.nextInt();
            while (scanner.hasNextInt()) {
                choseDice(myInt);
            }
            if (scanner.hasNext) {
                
            }
            checkForMultiples();
            checkForSingleDouble();
        }
    }
}
