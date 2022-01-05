package models;

public class Gato extends Felino {

  private String raca;
  
  public Gato() {
    super();
  }

  public Gato(String nome, String raca) {
    super(nome);
    this.raca = raca;
  }

  @Override
  public void comer() {
    System.out.println(super.getName() + " come ração.");
  }

  public void ronronar() {
    System.out.println(super.getName() + " está ronronando.");
  }

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  
  
}
