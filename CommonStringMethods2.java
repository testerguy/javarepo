
public class CommonStringMethods2 {
	
	public static void main(String[] args) {
		
	String longWord = "LongJohnSilverLongJohnSilver";
	
	String secondWord = "          kite";
		
	// indexOf(char)
		
	System.out.println("The position of 'J' in the string contained in variable 'longWord' is " + longWord.indexOf("J",5));
	
	// replace(string, string)
	
	System.out.println("Replace all instances of 'John' with 'Bill': " + longWord.replace("John", "Bill"));
	
	// concat(string)
	
	System.out.println(longWord.concat(secondWord));
	
	// toUpperCase()
	
	System.out.println("upper case the string contained in the 'longWord' variable ".concat(longWord.toUpperCase()));
	
	// trim()
	
	System.out.println("trim the string contained in the 'secondWord' variable and display: " + secondWord.trim());
	
	}

}
