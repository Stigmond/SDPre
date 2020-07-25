import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

    System.out.println("Please enter a number: ");

    int num = userInput.nextInt();

    if (num == 0) {
      System.out.println("0 is neither an even or odd number");
    }
    else if ((num % 2) == 0) {
      System.out.println("The number is even");
    }
    else {
      System.out.println("The number is odd");
    }
    userInput.close();
  }
}
