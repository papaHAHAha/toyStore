package presenter;

import java.util.List;

import model.Service;
import model.toy.toy;

public class Presenter {
  private Service service;

  public Presenter(Service service) {
    this.service = service;
  }

  public void addToy(String name, int amount, double weight) {
    service.addToy(name, amount, weight);
  }

  public void updateWeight(int id, double weight) {
    service.updateWeight(id, weight);
  }

  public List<toy> getToys(){
    return service.getToys();
  }
}
