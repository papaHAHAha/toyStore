package view;

import java.util.Scanner;

import presenter.Presenter;

public class Console {
  private Presenter presenter;
  private boolean work;
  private Scanner scanner;
  // private Menu menu;

  public Console() {
    presenter = new Presenter(this);
    
  }
}
