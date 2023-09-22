import model.Service;
import model.save.fileIo;
import model.save.fileManager;
import model.toy.toy;
import model.toy.toyStore;
import model.toy.toys;
import view.Console;
import view.View;

public class Main {
  public static void main(String[] args) {
    toys<toy> toys = new toys<>();
    toyStore<toy> prizeToys = new toyStore<>();

    toy toy1 = new toy("Конь", 15, 10.4);
    toy toy2 = new toy("а", 15, 7);
    toy toy3 = new toy("б", 15, 20);
    toy toy4 = new toy("в", 15, 4);
    toy toy5 = new toy("г", 15, 50);

    toys.add(toy1);
    toys.add(toy2);
    toys.add(toy3);
    toys.add(toy4);
    toys.add(toy5);

    fileIo fileIo = new fileManager();
    Service service = new Service(fileIo);
    service.setFileIo(fileIo);

    View view = new Console();
    view.setToys(toys);
    view.setPrizeToys(prizeToys);
    view.setFileIo(fileIo);
    view.start();
  }
}
