package model.save;

import java.io.IOException;

import model.toy.toy;

public interface fileIo {
  String filename = "prize_toys.txt";

  void saveToFile(toy toy, String filename) throws IOException;
}
