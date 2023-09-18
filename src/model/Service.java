package model;

import java.util.ArrayList;
import java.util.List;

import model.toy.toy;

public class Service {
  private List<toy> toys;

  public Service() {
    toys = new ArrayList<>();
  }

  public List<toy> getToys() {
    return toys;
  }

  public void addToy(String name, int amount, double weight) {
    toy toy = new toy(name, amount, weight);
    toys.add(toy);
  }

  public void updateWeight(int id, double weight) {
    for (toy toy : toys) {
      if (toy.getId() == id) {
        toy.setWeight(weight);
        break;
      }
    }
  }
}
