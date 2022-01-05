package models;

public class Felino {
  
  private String name;

  public Felino(){
    this.name = "Sem nome";
  }

  public Felino(String name) {
    this.name = name;
  }

  public void comer() {
    System.out.println(this.name + " come.");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
