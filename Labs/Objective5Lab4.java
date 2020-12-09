import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    //objective is to determine whether a numer is even or odd

    //declaring variable
    int userNum;

    //getting user input
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    userNum = input.nextInt();

    //logic to determine whether user input is odd or even and print output
    if(userNum % 2 == 0) {
      System.out.println("The number is even");
    }
    else {
      System.out.println("The number is odd");
    }
    input.close();
  }
}
