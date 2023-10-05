import java.util.Arrays;;

public class BubbleSort{
    public String bubbleSort(int a[], int n){
      boolean swapped;
      int temp;

      for(int i = 0; i < n; i++){
        swapped = false;
        for(int j = 0; j < n - i - 1; j++){
          if(a[j] > a[j+1]){
            temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
            swapped = true;
          }
        }

        if(swapped == false)
          break;
      }

      return "sorted Array a[]: " + Arrays.toString(a);
    }

    public static void main(String[] args){
      int a[] = new int[3];
      // for(int i = 0; i < 4; i++){
      //   a[i] = (int)(Math.random() * 10);
      // }
    
      a[0] = 0;
      a[1] = 2;
      a[2] = 1;
      a[3] = 2;
      a[4] = 0;

      System.out.println("Original array: a[] : " + Arrays.toString(a));

      BubbleSort sorted = new BubbleSort();
      System.out.println(sorted.bubbleSort(a, a.length));
    }
}