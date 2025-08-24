package tr1fker;

import tr1fker.handlers.InputHandler;
import tr1fker.handlers.RecordHandler;
import tr1fker.handlers.UIHandler;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        RecordHandler recordHandler = new RecordHandler();

        UIHandler uIHandler = new UIHandler(inputHandler, recordHandler);
        uIHandler.startConsole();
    }
}