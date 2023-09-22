package view.commands;

import view.Console;

public class savePrizeToy {
  private Console console;

    public savePrizeToy(Console console) {
        this.console = console;
    }

    public String getDescription() {
        return "Получить выигрыш";
    }

    public void execute(){
      console.savePrizeToyToFile();
    }
}
