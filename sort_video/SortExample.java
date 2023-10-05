package sort_video;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
  public static void main(String[] args) {
    ArrayList<Emp> emps = new ArrayList<>();

    emps.add(new Emp("Durgest", "3211231",  12));
    emps.add(new Emp("Bhavesh", "221144", 11));
    emps.add(new Emp("Ankit", "8972183", 45));

    System.out.println(emps);

    Collections.sort(emps, new NameComparator());

    System.out.println(emps);

    Collections.sort(emps, new IdComparator());

    System.out.println(emps);
  }
}
