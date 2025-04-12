import java.io.*;
import java.util.*;

public class ModifyTextFile {
    public static void main(String[] args) {
        String fileName = "Files.txt";  
        String oldWord = "programming";         
        String newWord = "Language";         

    List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line.replace(oldWord, newWord));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(" Error reading the file.");
            e.printStackTrace();
            return;
        }

       try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(" Error writing to the file.");
            e.printStackTrace();
        }
System.out.println(" File modification completed successfully!");
    }
}

