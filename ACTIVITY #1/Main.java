// Samuel Jacob Ulep
// BSIT 3 - E
// IT Professional Elective 1 | ITELEC 1
// Objective: if else arithmetic process
public class Main
{
	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 3;
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;
		int division = num1 / num2;
	
		// EXAMPLE 1
		System.out.println("Addition: " + addition);
		System.out.println("Subtraction: " + subtraction);
		System.out.println("Multiplication: " + multiplication);
		System.out.println("Division: " + division);
		
		// EXAMPLE 2
		int age = 18;
		
		if (age >= 18){
		    System.out.println("You are at the legal age.");
		}
		else if(age <= 17){
		    System.out.println("You are a minor!");
		}
	}
}
