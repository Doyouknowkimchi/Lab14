package edu.handong.csee.java.exeptionhandle.example.prob1;
import java.util.Scanner;
import java.util.Random;

public class SpeedLim_main { // class name 

	public static void main(String[] args) { // main method
		Scanner keyboard = new Scanner(System.in); // constructor
		Random rand = new Random(); // constuctor
		int limit = 0, speed = 0; // set variable

		System.out.print("Set the speed limit, officer: "); // print out
		limit = keyboard.nextInt(); // get variable
		speed = rand.nextInt(101); // get variable

		SpeedLimitter lim = new SpeedLimitter(limit, speed); // consturctor

		lim.warnSpeedLimit(); // call method

		keyboard.close();// call method

	}

}
