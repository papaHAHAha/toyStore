package presenter;

import model.Service;
import model.save.fileIo;
import model.toy.toy;
import model.toy.toyStore;
import model.toy.toys;
import view.View;

public class Presenter {
  private View view;
  private Service service;

  public Presenter(View view, toys<toy> toys, toyStore<toy> prizeToys) {
    service = new Service(toys, prizeToys);
    this.view = view;
  }

  public void setToys(toys<toy> toys) {
    service.setToys(toys);
  }

  public void setPrizeToys(toyStore<toy> prizeToys) {
    service.setPrizeToys(prizeToys);
  }

  public void setFileIo(fileIo fileIo) {
    service.setFileIo(fileIo);
  }

  public void addToy(String name, int amount, double weight) {
    String answer = service.addToy(name, amount, weight);
    view.print(answer);
  }

  public void updateWeight(int id, double weight) {
    String answer = service.updateWeight(id, weight);
    view.print(answer);
  }

  public void getToys() {
    String answer = service.getToys();
    view.print(answer);
  }

  public void chooseAndAddPrizeToy() {
    service.chooseAndAddPrizeToy();
  }

  public void savePrizeToyToFile() {
    service.savePrizeToyToFile();
  }
}
