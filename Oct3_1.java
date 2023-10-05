import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Oct3_1{
  public static void main(String[] args) throws IOException {
    File f = new File("newlist.txt");
    Scanner sc = new Scanner(f);

    String fileContents = "dfasf";
    while(sc.hasNextLine()){
      fileContents = fileContents.concat(sc.nextLine() + "asdf\n");
    }

    FileWriter fw = new FileWriter("newlist.txt");
    fw.append(fileContents);
    fw.close();
  }


}