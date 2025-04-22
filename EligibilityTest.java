package com.Tnsif.ExceptionHandling;

public class EligibilityTest {
    public static void RightAge(int age) {
	if(age>=18)
	{
		System.out.println("Candidate is Eligible to vote");
	}
	else {
		throw new ArithmeticException("Candidate is not Eligible to vote");
	}
	}
	public static void main(String[] args) {
		RightAge(17);
		

	}

}
