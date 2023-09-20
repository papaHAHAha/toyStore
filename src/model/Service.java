package model;

import java.util.List;

import model.toy.toy;
import model.toy.toys;

public class Service {
  private toys<toy> toys;

  public Service(toys<toy> toys) {
    this.toys = toys;
  }

  public String getToys() {
    return toys.getInfo();
  }

  public void setToys(toys<toy> toys) {
    this.toys = toys;
  }

  public String addToy(String name, int amount, double weight) {
    toy toy = new toy(name, amount, weight);
    toys.add(toy);
    return "Игрушка добавлена";
  }

  public String updateWeight(int id, double weight) {
    List<toy> toyList = toys.getToysList();
    for (toy toy : toyList) {
      if (toy.getId() == id) {
        toy.setWeight(weight);
        break;
      }
    }
    return "Вес изменен";
  }
}
