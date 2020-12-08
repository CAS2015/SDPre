public class Objective3Lab3 {
  public static void main(String[] args) {
    //Objective is to simulate a dice roll three times and sum the numbers
    //defining and initializing variables
    int first, second, third;
    first = 1 + (int)(Math.random() * 6);
    second = 1 + (int)(Math.random() * 6);
    third = 1 + (int)(Math.random() * 6);
    //printing out statement: "first + second + third = sum of variables"
    System.out.println(first + " + " + second + " + " + third + " = " + (first+second+third));
  }
}
