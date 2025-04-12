import java.io.FileWriter;
import java.io.IOException;
public class Write {
  public static void main(String[] args) {
    try{
      FileWriter writer=new FileWriter("Files.txt");
      writer.write("welcome to the java programming");
      writer.close();
      System.out.println("Sucessfully write into a file");
    }catch(IOException e){
      System.out.println("Unable to write into a file");
    }
  }
}
