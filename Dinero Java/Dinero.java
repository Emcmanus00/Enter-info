import java.util.Scanner;

/**
 *
 */
public class Dinero {
   public static void main(String[] args){

      key keyObject;
      String temp;
      try (Scanner input = new Scanner(System.in)) {
         keyObject = new key();
         System.out.println("Enter what you most desire: ");
         temp = input.nextLine();
      }
      keyObject.setName(temp);
      keyObject.saying();
   
   }
}