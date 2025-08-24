package tr1fker.handlers;

import tr1fker.model.Record;
import tr1fker.view.OutputConsole;

public class UIHandler {
    private InputHandler inputHandler;
    private RecordHandler recordHandler;

    private OutputConsole outputConsole;

    private boolean isRunning;

    public UIHandler(InputHandler inputHandler, RecordHandler recordHandler) {
        this.inputHandler = inputHandler;
        this.recordHandler = recordHandler;

        this.outputConsole = new OutputConsole();

        this.isRunning = false;
    }

    public void startConsole(){
        this.isRunning = true;

        while(this.isRunning){
            this.outputConsole.printCustomMenu();
            this.outputConsole.printIOption();

            int option = inputHandler.inputInteger();

            switch(option){
                case 1:
                    this.createRecord();
                    break;
                case 2:
                    this.showRecords();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    this.stopConsole();
                    break;
            }
        }

        outputConsole.printSuccessExit();
    }


    public void createRecord(){
        this.outputConsole.printIName();
        String name = inputHandler.inputString();
        this.outputConsole.printIPhone();
        String phone = inputHandler.inputString();
        recordHandler.addRecord(name, phone);
    }

    public void showRecords(){
        this.outputConsole.printRecords(this.recordHandler.getRecords());
    }

    public void stopConsole(){
        this.isRunning = false;
    }
}
