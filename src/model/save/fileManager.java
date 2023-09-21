package model.save;

import java.io.FileWriter;
import java.io.IOException;

import model.toy.toy;

public class fileManager implements fileIo {
  @Override
  public void saveToFile(toy toy, String filename) {
    try (FileWriter writer = new FileWriter(filename, true)) {
      writer.write(toy.toString() + "\n");
      System.out.println("Призовая игрушка получена");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
