package edu.handong.csee.java.exceptionhandle.example.prob3;

public class PowerCalc { // method name
	public long power(int n, int p) throws Exception // throw condition..(where is catch block?)
	{
		long result = 0; // variable

		result = (long)Math.pow(n, p); // set variable
		if(n < 0 || p < 0) // condition
		{
			throw new Exception("n or p should not be negative."); // throw...(I Don't now exactly... why new..?)
		}
		if(n == 0 && p == 0) // condition
		{
			throw new Exception("n and p should not be zero."); // throw...
		}
		return result; // return result
	}

}
