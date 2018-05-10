package edu.handong.csee.java.exeptionhandle.example.prob1;

public class SpeedLimitter { //class name
	private int speed = 0; //variable
	private int limit = 0; // variable
	public SpeedLimitter(int limit, int speed) // method name, input
	{
		this.limit = limit; // set method
		this.speed = speed; // set method
	}

	public void warnSpeedLimit() // method name
	{
		try { // try block
			if(this.speed > this.limit) // condition
			{
				throw new Exception("Speed Limit " + this.limit + "km exceeded!"); // throw condition
			}
			System.out.println("You are a law abiding citizen!"); // show text
		}catch(Exception e) { //catch block
			System.out.println(e.getMessage()); //show text
			System.out.println("You are being fined. "); //show text
		}
		System.out.println("Your current speed: " + this.speed); // show text
	}
}
