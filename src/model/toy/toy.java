package model.toy;

public class toy implements toysItem<toy>{
  private long id;
  private String name;
  private int amonut;
  private double weight;

  public toy(String name, int amount, double weight) {
    id = -1;
    this.name = name;
    this.amonut = amount;
    this.weight = weight;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public int getAmount() {
    return amonut;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void decreaseAmount() {
    this.amonut--;
}

  @Override
  public String toString() {
    return getInfo();
  }

  public String getInfo() {
    StringBuilder sb = new StringBuilder();
    sb.append("id: ");
    sb.append(id);
    sb.append(", название: ");
    sb.append(name);
    sb.append(", количество: ");
    sb.append(getAmount());
    sb.append(", вес: ");
    sb.append(getWeight());
    return sb.toString();
  }

}
