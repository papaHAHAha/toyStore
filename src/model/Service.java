package model;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import model.save.fileIo;
import model.toy.toy;
import model.toy.toyStore;
import model.toy.toys;

public class Service {
  private toys<toy> toys;
  private toyStore<toy> prizeToys;
  private fileIo fileIo;

  public Service(toys<toy> toys, toyStore<toy> prizeToys) {
    this.toys = toys;
    this.prizeToys = prizeToys;
  }

  public Service(fileIo fileIo){
    this.fileIo = fileIo;
  }

  public String getToys() {
    return toys.getInfo();
  }

  public void setToys(toys<toy> toys) {
    this.toys = toys;
  }

  public void setPrizeToys(toyStore<toy> prizeToys) {
    this.prizeToys = prizeToys;
  }

  public void setFileIo(fileIo fileIo){
    this.fileIo = fileIo;
  }

  public String addToy(String name, int amount, double weight) {
    toy toy = new toy(name, amount, weight);
    toys.add(toy);
    return "Игрушка добавлена";
  }

  public void chooseAndAddPrizeToy() {
    if (toys.size() == 0) {
      System.out.println("Нет доступных игрушек.");
      return;
    }

    double totalWeight = toys.stream().mapToDouble(toy::getWeight).sum();

    Random random = new Random();
    double randomWeight = random.nextDouble() * totalWeight;

    double currentWeight = 0;
    toy selectedToy = null;

    for (toy toy : toys) {
      currentWeight += toy.getWeight();
      if (currentWeight >= randomWeight) {
        selectedToy = toy;
        System.out.println("Призовая игрушка: " + selectedToy);
        System.out.println();
        break;
      }
    }

    if (selectedToy != null) {
      prizeToys.add(selectedToy);
    } else {
      System.out.println("Не удалось выбрать призовую игрушку.");
    }
  }

  public void savePrizeToyToFile() {
    if (prizeToys.size() == 0) {
      System.out.println("Нет призовых игрушек для сохранения.");
      return;
    }
    toy selectedToy = prizeToys.get(0);
    prizeToys.remove(0);

    try {
      fileIo.saveToFile(selectedToy, fileIo.filename);
    } catch (IOException e) {
      System.err.println("Ошибка при выдаче игрушки: " + e.getMessage());
    }

    selectedToy.decreaseAmount();
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
