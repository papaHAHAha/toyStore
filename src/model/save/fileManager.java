package model.save;

import java.io.FileWriter;
import java.io.IOException;

import model.toy.toy;

public class fileManager implements fileIo {
  @Override
  public void saveToFile(toy toy, String filename) {
    try (FileWriter writer = new FileWriter(filename, true)) {
      writer.write("ПРИЗ(название игрушки): " + toy.getName() + "\n");
      System.out.println("Призовая игрушка получена");
      System.out.println();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
