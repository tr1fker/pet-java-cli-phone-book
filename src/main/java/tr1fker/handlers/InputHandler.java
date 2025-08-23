package tr1fker.handlers;

import java.util.Scanner;

public class InputHandler {
    private static final Scanner scanner;

    static{
        scanner = new Scanner(System.in);
    }


    public int inputInteger(){
        return scanner.nextInt();
    }

    public String inputString(){
        return scanner.next();
    }
}
