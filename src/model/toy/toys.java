package model.toy;

import java.util.ArrayList;
import java.util.List;

public class toys<E extends toysItem<E>> {
  private long toysId;
  private List<E> toys;

  public toys() {
    this(new ArrayList<>());
  }

  public toys(List<E> toys) {
    this.toys = toys;
  }

  public boolean add(E toy) {
    if (toy == null) {
      return false;
    }
    if (!toys.contains(toy)) {
      toys.add(toy);
      toy.setId(toysId++);
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return getInfo();
  }

  public String getInfo() {
    StringBuilder sb = new StringBuilder();
    sb.append("В списке ");
    sb.append(toys.size());
    sb.append(" игрушек: \n");
    for (E toy : toys) {
      sb.append(toy);
      sb.append("\n");
    }
    return sb.toString();
  }
}
