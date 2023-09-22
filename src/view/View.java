package view;

import model.save.fileIo;
import model.toy.toy;
import model.toy.toyStore;
import model.toy.toys;

public interface View {
  void start();
  void print(String text);
  void exit();
  public void setToys(toys<toy> toys);
  public void setPrizeToys(toyStore<toy> prizeToys);
  public void setFileIo(fileIo fileIo);
}
