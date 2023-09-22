package view;

import java.util.Scanner;

import model.save.fileIo;
import model.toy.toy;
import model.toy.toyStore;
import model.toy.toys;
import presenter.Presenter;

public class Console implements View {
  private Presenter presenter;
  private boolean work;
  private Scanner scanner;
  private Menu menu;

  public Console() {
    presenter = new Presenter(this, null, null);
    scanner = new Scanner(System.in);
    menu = new Menu(this);
    work = true;
  }

  @Override
  public void start() {
    while (work) {
      System.out.println(menu.print());
      String choice = scanner.nextLine();
      menu.execute(choice);
    }
  }

  @Override
  public void exit() {
    work = false;
    System.out.println("Программа завершена.");
  }

  @Override
  public void print(String text) {
    System.out.println(text);
  }

  public void setToys(toys<toy> toys) {
    presenter.setToys(toys);
  }

  public void setPrizeToys(toyStore<toy> prizeToys) {
    presenter.setPrizeToys(prizeToys);
  }

  public void setFileIo(fileIo fileIo) {
    presenter.setFileIo(fileIo);
  }

  public void addToy(String name, int amount, double weight) {
    presenter.addToy(name, amount, weight);
  }

  public void updateWeight(int id, double weight) {
    presenter.updateWeight(id, weight);
  }

  public void getToys() {
    presenter.getToys();
  }

  public void chooseAndAddPrizeToy() {
    presenter.chooseAndAddPrizeToy();
  }

  public void savePrizeToyToFile() {
    presenter.savePrizeToyToFile();
  }
}
