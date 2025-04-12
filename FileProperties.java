import java.io.File;
public class FileProperties {
  public static void main(String[] args) {
    File file=new File("Files.txt");
      if(file.exists()){
        System.out.println("File name:"+file.getName());
        System.out.println("File path:"+file.getPath());
        System.out.println("Able to write:"+file.canWrite());
        System.out.println("Able to read:"+file.canRead());
      }
      else{
        System.out.println("Files does not exist");
      }
    }
    }
    
  