package model.toy;

import java.util.ArrayList;
import java.util.List;

public class toyStore<E extends toysItem<E>> {
  private long toysId;
  private List<E> prizeToys;

  public toyStore() {
    this(new ArrayList<>());
  }

  public toyStore(List<E> prizeToys) {
    this.prizeToys = prizeToys;
  }

  public boolean add(E toy) {
    if (toy == null) {
      return false;
    }
    if (!prizeToys.contains(toy)) {
      prizeToys.add(toy);
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
    sb.append("В призовом списке ");
    sb.append(prizeToys.size());
    sb.append(" игрушек/ки: \n");
    for (E toy : prizeToys) {
      sb.append(toy);
      sb.append("\n");
    }
    return sb.toString();
  }

}
