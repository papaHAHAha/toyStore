package view.commands;

import java.util.Scanner;

import view.Console;

public class addToy {
  private Console console;

  public addToy(Console console) {
    this.console = console;
  }

  public String getDescription() {
    return "Добавить игрушку";
  }

  public void execute() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Введите имя игрушки: ");
      String name = scanner.nextLine();
      System.out.print("Введите количество: ");
      int amount = scanner.nextInt();
      System.out.print("Введите точный вес: ");
      double weight = scanner.nextDouble();

      console.addToy(name, amount, weight);
  }
}
