
// Q2. Create File using File class?
import java.io.File;
import java.io.IOException;

public class Program2 {
  public static void main(String[] args) throws IOException {
    File f = new File("file.txt");
    System.out.println(f.getAbsolutePath());
    if (f.createNewFile()) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
