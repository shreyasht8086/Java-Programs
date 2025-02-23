
//Q.Q1. WAP to create file and store only even size words in file using BufferedWriter
//Example:
//Abc Mnop pqr

import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;

public class Program8 {
  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str = sc.nextLine();
    String words[] = str.split(" ");

    sc.close();
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\ABC\\A\\a.txt"));
      for (String word : words) {
        if (word.length() % 2 == 0) {
          writer.write(word);
          writer.newLine();
          System.out.println("Even string inserted");
          writer.close();
        }
      }
    } catch (Exception e) {
      // TODO: handle exception
    }

  }
}