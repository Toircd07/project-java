package lungtung;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class

public class Toi {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt",true);
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.write("\nAppended text!");
      myWriter.close();  // must close manually
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

