package view;

import model.toy.toy;
import model.toy.toys;

public interface View {
  void start();
  void print(String text);
  void exit();
  public void setToys(toys<toy> toys);
}
