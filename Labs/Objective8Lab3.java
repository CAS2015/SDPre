public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    for(int i = 1; i <= 20; i++) {
      counter = i % 2;
      switch (counter) {
        case 0:
          System.out.println(i + " is even");
          break;
        default:
          System.out.println(i + " is odd");
          break;
      }
    }
  }
}
