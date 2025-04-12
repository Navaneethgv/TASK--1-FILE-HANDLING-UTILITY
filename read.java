import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class read {
  public static void main(String[] args) {
    try{
      File file=new File("Files.txt");
      Scanner sc=new Scanner(file);
      while(sc.hasNextLine()){
        String content=sc.nextLine();
        System.out.println(content);
      }
    }catch(IOException e){
      System.out.println("Not able to read a file");
    }
  }
}
