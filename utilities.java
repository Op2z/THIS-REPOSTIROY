import java.util.*;
public class utilities {
  public static void printHello (String input){
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
