package view.commands;

import view.Console;

public class choosePrizeToy {
  private Console console;

    public choosePrizeToy(Console console) {
        this.console = console;
    }

    public String getDescription() {
        return "Организовать розыгрыш игрушек(рандомно выбирает призовую игрушку)";
    }

    public void execute(){
      console.chooseAndAddPrizeToy();
    }
}
