package view;

import java.util.ArrayList;
import java.util.List;

import view.commands.addToy;
import view.commands.exit;
import view.commands.getToys;
import view.commands.updateWeight;

public class Menu {
  private List<getToys> list;
  private addToy addToycmd;
  private updateWeight updateWeightcmd;
  private exit exitcmd;

  public Menu(Console console) {
    list = new ArrayList<>();
    list.add(new getToys(console));

    addToycmd = new addToy(console);
    exitcmd = new exit(console);
    updateWeightcmd = new updateWeight(console);
  }


  public String print() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < list.size(); i++) {
      stringBuilder.append(i + 1);
      stringBuilder.append(". ");
      stringBuilder.append(list.get(i).getDescription());
      stringBuilder.append("\n");
    }
    stringBuilder.append(list.size() + 1);
    stringBuilder.append(". ");
    stringBuilder.append(addToycmd.getDescription());
    stringBuilder.append("\n");

    stringBuilder.append(list.size() + 2);
    stringBuilder.append(". ");
    stringBuilder.append(updateWeightcmd.getDescription());
    stringBuilder.append("\n");

    stringBuilder.append(list.size() + 3);
    stringBuilder.append(". ");
    stringBuilder.append(exitcmd.getDescription());
    stringBuilder.append("\n");

    return stringBuilder.toString();
  }

  public void execute(String choice) {
    int index = Integer.parseInt(choice) - 1;

    if (index == list.size()) {
      addToycmd.execute();
    } else if (index == list.size() + 1) {
      updateWeightcmd.execute();
    } else if (index == list.size() + 2) {
      exitcmd.execute();
    } else {
      list.get(index).execute();
    }
  }
}
