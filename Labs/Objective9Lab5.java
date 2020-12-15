import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    double num1, num2;
    boolean keepGoing = true;
    int choice;
    double answer = 0.0;

    //Part 1 & 2: User inputs
    System.out.println("Please give me a number: ");
    num1 = kb.nextDouble();

    System.out.println("Please give me another number: ");
    num2 = kb.nextDouble();

    while (keepGoing) {
      printMenu();
      System.out.print("Which would you like to do? ");
      choice = kb.nextInt();

      switch(choice) {
        //Part 3: Complete switch to call methods and print result
        case 1:
          double sum = findSum(num1,num2);
          System.out.println(num1 + " + " + num2 + " = " + sum);
          break;
        case 2:
          double average = findAverage(num1,num2);
          System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
          break;
        case 3:
          double tax = calcTax(num1,num2);
          System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + tax);
          break;
        case 4:
          System.out.println("You've chose to quit.");
          break;
        default:
          System.out.println("Invalid entry. Please try again");
          break;
      }

      if( choice == 4) {
        keepGoing = false;
      }
    }
    kb.close();
  }

  public static void printMenu() {
    System.out.println();
    System.out.println("========= MENU =========");
    System.out.println("|                      |");
    System.out.println("|   1. Add Numbers     |");
    System.out.println("|   2. Find Average    |");
    System.out.println("|   3. Calculate Tax   |");
    System.out.println("|   4. Exit            |");
    System.out.println("|                      |");
    System.out.println("========================");
    System.out.println();
  }

  public static double findSum(double x, double y) {
    double sum = x + y;
    return sum;
  }

   public static double findAverage(double x, double y) {
     double average = (x + y) / 2;
     return average;
   }

   public static double calcTax(double x, double y) {
     double tax = (x + y) * 0.0831;
     return tax;
   }

}
