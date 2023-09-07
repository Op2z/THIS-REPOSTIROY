import java.util.*;
public class utilities {
  public static void printHello (){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    if (input.equalsIgnoreCase("Hello")){
      System.out.println("Hello World.");
    }
    else if (input.equalsIgnoreCase("Goodbye")){
      System.out.println("Goodbye World.");
    }
    else {
      System.out.println("abc");
    }
  }
}
