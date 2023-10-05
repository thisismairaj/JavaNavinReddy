import java.util.Arrays;

enum Laptop{
  XPS(220), Macbook, Elitebook(300), Surface(1400);

  private int price;

  private Laptop(){
    price = 100;
    System.out.println("In default constructor");
  }

  private Laptop(int price){
    this.price = price;
    System.out.println("In paramterized constructor");
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  
}
public class Oct4{
  public static void main(String[] args) {
    Laptop lap = Laptop.Macbook;
    System.out.println(lap + " : " + lap.getPrice());

    for(Laptop l : Laptop.values()){
      System.out.println(l.name() + " : " + l.getPrice());
    }
  }
}