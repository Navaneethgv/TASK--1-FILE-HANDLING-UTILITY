import java.io.FileWriter;
import java.io.IOException;
public class append {
  public static void main(String[] args) {
    try{
      FileWriter file=new FileWriter("Files.txt",true);
      file.write("\nCurrently Learning a fileHandling");
      file.close();
      System.out.println("Successfully append a content");
    }catch(IOException e){
      System.out.println("Not able to appent to the file");
    }
  }
}
