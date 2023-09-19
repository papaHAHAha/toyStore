package view.commands;

import view.Console;

public class getToys {
  private Console console;

    public getToys(Console console) {
        this.console = console;
    }

    public String getDescription() {
        return "Получить список игрушек";
    }

    public void execute(){
      console.getToys();
    }
}
