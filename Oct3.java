interface InterfaceExample{
  String color = "blue";

  void fillUp();
}

public class Oct3 implements InterfaceExample{
  public static void main(String[] args){
    Oct3 water = new Oct3();
    System.out.println(color);

    water.fillUp();
  }
  public void fillUp(){
    System.out.println("hello I am filling");
  }
}
