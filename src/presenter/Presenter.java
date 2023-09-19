package presenter;

import model.Service;
import model.toy.toy;
import model.toy.toys;
import view.View;

public class Presenter {
  private View view;
  private Service service;

  public Presenter(View view, toys<toy> toys) {
    service = new Service(toys);
    this.view = view;
  }

  public void setToys(toys<toy> toys) {
    service.setToys(toys);
  }

  public void addToy(String name, int amount, double weight) {
    String answer = service.addToy(name, amount, weight);
    view.print(answer);
  }

  public void updateWeight(int id, double weight) {
    service.updateWeight(id, weight);
  }

  public void getToys() {
    String answer = service.getToys();
    view.print(answer);
  }
}
