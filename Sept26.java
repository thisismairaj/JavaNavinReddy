
class Sept26{
  public static void main(String[] args){
    B obj1 = new B(12);
  }
}


class A{ // Super Class

  public A(){
    super();
    System.out.println("IN A's constructor");
  }
  public A(int n){
    super();
    System.out.println("IN A's int");
  }
}

class B extends A{ // Sub Class
  public B(){
    super();
    System.out.println("IN B's constructor");
  }

  public B(int n){
    System.out.println("IN paramaterized B");
  }
}

