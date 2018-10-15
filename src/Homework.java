import java.util.Random;

// Ahsan Iqbal
// This is my integration project.
public class Homework {

	public static void main(String args[]) {
		System.out.println("Welcome to my Integration Project");
		String name = "Ahsan"; // string is used for text.
		int age = 21; // integer is used as a number
		boolean alive = true; // boolean is used for true and false
		double temperature = 75.5; // double is used for decimals
		final String planet = "Earth"; // final makes the variable unchangable after initial assignment.
		age = (int) 21.5; // casting changes one data type to another.
		int length = name.length(); // tells us the how many characters there are in the variable
		char firstLetter = name.charAt(0); // charAt tells us character at index provided.
		name = name.toLowerCase(); // returns a copy of the string which is lower case.

		String text = "\"Ahsan\"\t\tis\ngreat!"; // using multiple escape sequences
		System.out.println(text);

		// myMethod() the method call and 1997 is the argument
		System.out.println(myMethod(1997));
		Random randomValue = new Random();
		System.out.println(randomValue.nextInt(100));

		// Use of Math class
		System.out.println(Math.pow(3, 2));

		// Use of if/else
		if (age >= 21) {
			System.out.println("You can drink!");
		} else {
			System.out.println("You cannot drink :(");
		}

		// Switch statement
		switch (name) {
		case "ahsan":
			System.out.println("Hi Ahsan!");
			break;
		case "amir":
			System.out.println("Hi Amir, How is FSW?");
			break;
		default:
			System.out.println("Hi There!");
		}

		// compareTo returns an integer which compares the argument to string
		// lexicographically
		System.out.println(name.compareTo("amir"));
		// equals returns true if and only if the argument exactly matches the argument
		System.out.println(name.equals("ahsan"));
		// == is used to compare the references of the objects and returns true if both point to the same object
		String test = name;
		System.out.println(name == test);

		int a = 5;
		a++;
		a--;
		a = a / 2;
		a = a * 3;
		a += 1;
		int m = a % 2;

		System.out.println(a);
		// Use of relational
		if (a > 6 && a < 8) {
			System.out.println("a is 7");
		}
		if (a % 2 == 1 || m > 0) {
			System.out.println("a is odd");
		}
		
		// Java uses BODMAS for operator precedence which is brackets of division, multiplication, addition and subtraction
		int num = 2 + 9 / 3 * 5 - 1;
		System.out.println(num);
	}

	public static int myMethod(int year) {
		return 2018 - year;
	}
}