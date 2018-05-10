package edu.handong.csee.java.exceptionhandle.example.prob4;
import java.util.Scanner;

public class Bound_main { // class name

	public static void main(String[] args) //main method
	{
		Scanner keyboard = new Scanner(System.in); // ready for input from keyboard
		int num = 0; // variable
		Boundary arr = new Boundary(); //construct
		boolean repeat = true; // set true
		while(repeat) // condition
		{
			try // try block
			{
				System.out.print("Enter an integer: "); // show text
				num = keyboard.nextInt(); // get num
				arr.receive(num); // call method
			}
			catch(ArrayIndexOutOfBoundsException e) //catch block
			{
				System.out.println("Invalid array index access!"); //show text
				repeat = false; // set false
			}
		}
	}

}
