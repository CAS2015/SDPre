public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1, num1;

    while (counter <= 20) {
      num1 = counter % 2;
      switch(num1) {
        case 0:
          System.out.println(counter + " is even");
          break;
        default:
          System.out.println(counter + " is odd");
          break;
      }
      counter ++;
    }
  }
}
