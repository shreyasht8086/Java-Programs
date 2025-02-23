// Q1. Create folder using File class 

import java.io.File;
import java.io.IOException;

public class Program1 {
  public static void main(String[] args) throws IOException {
    File f = new File("D:\\Java programs\\Floder");
    System.out.println(f.getAbsolutePath());
    if (f.create) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
