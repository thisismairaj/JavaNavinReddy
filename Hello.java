import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class Hello {
    public static void main(String args[]) {
    
    // HashMap<String,String> fun = new HashMap<String,String>();

    // fun.put("Something", "33");
    // fun.put("b","22");
    // fun.put("a", "23");

    // System.out.println(fun);
    // fun.remove("b");

    // System.out.println(fun);

    // System.out.println(fun.values());

    HashSet<Integer> hd = new HashSet<Integer>();
    hd.add(33);
    hd.add(12);
    hd.add(8);
    hd.add(2);
    hd.add(32);
    hd.size();
    // hd.remove("dd");
    // System.out.println(hd);

    Object[] h = hd.toArray();
    // System.out.println(h[0]);
    // System.out.println(Arrays.toString(h));

    // Iterator<Integer> it = hd.iterator();

    // while(it.hasNext()){
    //   System.out.println(it.next());
    // }

    Integer[] A = {22, 45,33, 66, 55, 34, 77};  
    Integer[] B = {33, 2, 83, 45, 3, 12, 55};  
    Set<Integer> set1 = new HashSet<Integer>();    
    set1.addAll(Arrays.asList(A));    
    Set<Integer> set2 = new HashSet<Integer>();    
    set2.addAll(Arrays.asList(B));    

    // Finding Union of set1 and set2   
    Set<Integer> union_data = new HashSet<Integer>(set1);    
    union_data.addAll(set2);    
    System.out.print("Union of set1 and set2 is:");    
    System.out.println(union_data);    

    
  } 
}

class Student{
  String name1;
  int rollno;
  int marks;  
}
