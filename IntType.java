import java.util.Scanner;

class IntType {
  public static void main(String args[]) {
	Scanner inputvar = new Scanner(System.in);
    int boys, girls, people;
    System.out.println("Give the number of boys: ");
    boys = inputvar.nextInt();
    System.out.println("Give the number of girls: ");
    girls = inputvar.nextInt();
    people = boys % girls;
    // should give 2
    System.out.println(people);
  }
}