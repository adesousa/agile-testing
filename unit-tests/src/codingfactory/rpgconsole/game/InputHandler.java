package codingfactory.rpgconsole.game;

import java.util.Scanner;

public class InputHandler {

    private Scanner scanner;

    public InputHandler(){
        scanner = new Scanner(System.in);
    }

    public Character getChar(){
        return scanner.next().charAt(0); //return string in pos 0
    }

    public String getString(){
        return scanner.next(); //return string
    }
}
