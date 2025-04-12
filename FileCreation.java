import java.io.File;
import java.io.IOException;
public class FileCreation{
  public static void main(String[] args) {
    try{
    File file=new File("Files.txt");
      if(file.createNewFile()){
        System.out.println("File name:"+file.getName());
      }
   }catch(IOException e){
    System.out.println("Already created file is there");
   }
}
}