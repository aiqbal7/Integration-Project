import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		// Ternary operators are used to inline boolean expressions
		String canYouDrink = age >= 21 ? "Yes" : "No";

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

		// Use of math operations
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

		// Create and use while loops
		int i = 0;
		System.out.println("\nWhile loop:");
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		// Use for loop
		System.out.println("\nFor loop:");
		for (i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// Use do-while loop
		System.out.println("\nDo-While loop:");
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while(i < 10);

		// Use of break and continue:
		// break: break out the current loop execution
		// continue: skip the current iteration of the loop
		System.out.println("\nUse of break and continue:");
		for (i =0; i < 10; i++) {
			if (i == 0) continue;
			if (i == 5) break;
			System.out.println(i);
		}

		// Describe inheritance and its benefits
		// Description: It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class
		// Benefits: Clean code, code re-use, code de-duplication

		// Develop code that makes use of polymorphism:
		Person brian = new Person("Brian", 25);
		// amy variable is declared as a person but the object is instantiated as a Female
		Person amy = new Female("Amy", 29);
		System.out.println(amy.getName());

		// Declare, instantiate and initialize a one-dimensional array
		int[] numbers = {5,1,2,4};
		int min = numbers[0];

		// Find the smallest value in an array - we can sort the array and the smallest value is the first element in the array
		for (int number : numbers) {
			if (number < min) min = number;
		}
		System.out.println("Smallest number in array is: " + min);

		// Sum using accumulator
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println("Sum of array is: " + sum);

		// Search an array and identify the index where the target was found
		int target = 4;
		// Option 1 - use Arrays.binarySearch
		System.out.println(target + " was found in index: " +Arrays.binarySearch(numbers, target));

		// Option 2 - Use for loop
		int found = -1;
		for (i = 0; i < numbers.length; i++) {
			if (numbers[i] == target)
			{
				found = i;
				break;
			}
		}
		System.out.println(target + " was found in index: " + found);

		// Declare, instantiate, initialize and use a multi-dimensional array
		int [][] numbers_2d = {{1,2,3},{4,5,6},{7,8,9}};
		for (int[] arr : numbers_2d) {
			System.out.println(Arrays.toString(arr));
		}

		// Declare and use an ArrayList of a given type
		List<Integer> list = new ArrayList<>();
		list.add(2);
		System.out.println(list.get(0));

		int found1 = -1, found2 = -1;
		for (int b1 = 0; b1 < numbers_2d.length; b1++) {
			for (int b2 = 0; b2 < numbers_2d[0].length; b2++) {
				if (numbers_2d[b1][b2] == target) {
					found1 = b1;
					found2 = b2;
				}
			}
		}

		System.out.println(target + " was found in " + found1 + "," + found2 + " in the 2d array.");

		// Exception handling
		Person p = null;
		try {
			System.out.println(p.getName());
		} catch (NullPointerException nlp) {
			System.out.println("Person is null");
		} catch (Exception e) {
			System.out.println("generic exception");
		}

	}

	public static int myMethod(int year) {
		return 2018 - year;
	}
}