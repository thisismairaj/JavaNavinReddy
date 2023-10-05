public class Oct2 extends Thread{
  public void run(){
    for(int i = 0; i <= 10; i++){
      System.out.println("i = " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args){
    Oct2 th = new Oct2();
    th.start();
  }
}