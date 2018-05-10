package edu.handong.csee.java.exceptionhandle.example.prob3;
import java.util.Scanner;

public class Power_main { // class name 
	public static final PowerCalc my_calculator = new PowerCalc(); // constructor
	public static final Scanner in = new Scanner(System.in); // constructor

	public static void main(String[] args) { // main method
		while (in.hasNextInt()) { // condition
			int n = in.nextInt(); // get value
			int p = in.nextInt(); // get value

			try { //try block
				System.out.println(my_calculator.power(n, p)); //show text
			} catch (Exception e) { //catch block
				System.out.println(e); //show
			}
		}
	}

}
