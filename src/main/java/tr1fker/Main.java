package tr1fker;

import tr1fker.handlers.InputHandler;
import tr1fker.handlers.UIHandler;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();

        UIHandler uIHandler = new UIHandler(inputHandler);
        uIHandler.startConsole();
    }
}