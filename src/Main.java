

import model.toy.toy;
import model.toy.toys;
import view.Console;
import view.View;

public class Main {
  public static void main(String[] args) {
    toys<toy> toys = new toys<>();

    toy toy1 = new toy("Конь", 20, 10.4);
    toy toy2 = new toy("олень", 15, 15);

    toys.add(toy1);
    toys.add(toy2);
    System.out.println(toy1.toString());
    System.out.println(toy2.toString());

    View view = new Console();

    view.setToys(toys);
    view.start();
  }
}
