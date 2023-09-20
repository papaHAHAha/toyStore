package view.commands;

import java.util.Scanner;

import view.Console;

public class updateWeight {
  private Console console;

  public updateWeight(Console console) {
    this.console = console;
  }

  public String getDescription() {
    return "Обновить вес игрушки";
  }

  public void execute() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Введите ID игрушки: ");
      int id = scanner.nextInt();
      System.out.print("Введите измененный вес: ");
      double weight = scanner.nextDouble();

      console.updateWeight(id, weight);
  }
}
