package model.toy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class toys<E extends toysItem<E>> implements Iterable<E> {
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

   public int size() {
        return toys.size();
    }

    public Stream<E> stream() {
        return toys.stream();
    }

  @Override
    public Iterator<E> iterator() {
        return toys.iterator();
    }

  @Override
  public String toString() {
    return getInfo();
  }

  public String getInfo() {
    StringBuilder sb = new StringBuilder();
    sb.append("В списке ");
    sb.append(toys.size());
    sb.append(" игрушек/ки: \n");
    for (E toy : toys) {
      sb.append(toy);
      sb.append("\n");
    }
    return sb.toString();
  }

  public List<E> getToysList(){
    return toys;
  }
}
