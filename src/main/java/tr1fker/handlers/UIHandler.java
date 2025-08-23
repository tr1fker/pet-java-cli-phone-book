package tr1fker.handlers;

import tr1fker.view.OutputConsole;

public class UIHandler {
    private InputHandler inputHandler;

    private OutputConsole outputConsole;

    private boolean isRunning;

    public UIHandler(InputHandler inputHandler) {
        this.inputHandler = inputHandler;

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
                    break;
                case 2:
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


    public void stopConsole(){
        this.isRunning = false;
    }
}
