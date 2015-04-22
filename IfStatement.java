import java.util.Scanner;

class IfStatement {
  public static void main(String args[]) {
	  Scanner inputvar = new Scanner(System.in);
	   
	  System.out.println("Input number: ");
	  
	  int test = inputvar.nextInt();
	  
	  if (test == 9) {
		  System.out.println("yes");
	  }
	  else {
		  System.out.println("this is else");
	  }
  }
}
