package model;

import java.util.ArrayList;
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

  public void setToys(toys<toy> toys){
    this.toys = toys;
  }

  public String addToy(String name, int amount, double weight) {
    toy toy = new toy(name, amount, weight);
    toys.add(toy);
    return "Игрушка добавлена";
  }

  public void updateWeight(int id, double weight) {
    String toysInfo = toys.getInfo();
    String[] toyLines = toysInfo.split("\n");

    for (String toyInfo : toyLines) {
        String[] parts = toyInfo.split(",");  
        int toyId = Integer.parseInt(parts[0]);
        if (toyId == id) {
            toy toy = new toy(parts[1], Integer.parseInt(parts[2]), Double.parseDouble(parts[3]));
            toy.setWeight(weight);
            break;
        }
    }
}
}
