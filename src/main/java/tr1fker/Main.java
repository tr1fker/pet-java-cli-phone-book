package tr1fker;

import tr1fker.handlers.GsonHandler;
import tr1fker.handlers.InputHandler;
import tr1fker.handlers.RecordHandler;
import tr1fker.handlers.UIHandler;

public class Main {
    private static final String filePathRecords = "records.json";
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        GsonHandler gsonHandler = new GsonHandler(filePathRecords);
        RecordHandler recordHandler = new RecordHandler(gsonHandler);

        UIHandler uIHandler = new UIHandler(inputHandler, recordHandler);
        recordHandler.loadRecords();

        uIHandler.startConsole();

        recordHandler.saveRecords();
    }
}