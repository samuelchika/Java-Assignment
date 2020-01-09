/*
 * An int data field named value that stores the int value represented by this
object.
A constructor that creates a MyInteger object for the specified int value.
A getter method that returns the int value.
The methods isEven() , isOdd() , and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
The static methods isEven(int) , isOdd(int) , and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
The static methods isEven(MyInteger) , isOdd(MyInteger) , and
isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
A static method parseInt(String) that converts a string into an int
value.
 */
package com.cSam.classes;

public class MyInteger {
	int value;
	
	public MyInteger() {
		
	}
	public MyInteger(int number) {
		value = number;
	}
	
	public void getNumber(int number) {
		value = number;
	}
	public void setInteger(int num) {
		value = num;
	}
	
	public boolean isEven() {
		return (value % 2 == 0) ? true : false;
	}
	public boolean isOdd() {
		return (value % 2 == 1) ? true : false;
	}
	public boolean isPrime() {
		int n;
		 
		n = (int)(Math.sqrt(value));
		if(n == 1) {
			return true;
		} else {
			for (int i = 2; i <= n; i++) {
				if(value % i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	//checking with passed Variables (integer)
	public boolean isEven(int value) {
		return (value % 2 == 0) ? true : false;
	}
	public boolean isOdd(int value) {
		return (value % 2 == 1) ? true : false;
	}
	public boolean isPrime(int value) {
		int n;
		 
		n = (int)(Math.sqrt(value));
		if(n == 1) {
			return true;
		} else {
			for (int i = 2; i <= n; i++) {
				if(value % i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	//checking with MyInteger type
	public boolean isEven(MyInteger value) {
		String s = "" + value;
		int values = Integer.parseInt(s);
		return (values % 2 == 0) ? true : false;
	}
	public boolean isOdd(MyInteger value) {
		String s = "" + value;
		int values = Integer.parseInt(s);
		return (values % 2 == 1) ? true : false;
	}
	public boolean isPrime(MyInteger value) {
		String s = "" + value;
		int values = Integer.parseInt(s);
		int n;
		 
		n = (int)(Math.sqrt(values));
		if(n == 1) {
			return true;
		} else {
			for (int i = 2; i <= n; i++) {
				if(values % i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean equals(int number) {
		return (value == number) ? true : false;
	}
	public boolean equals(MyInteger number) {
		String s = "" + number;
		int values = Integer.parseInt(s);
		return (value == values) ? true : false;
	}
	
	public int parseInt(char[] c) {
		return Integer.parseInt("" + c);
	}
	public int parseInt(MyInteger num) {
		return Integer.parseInt("" + num);
	}
	public int parseInt(String num) {
		return Integer.parseInt("" + num);
	}
}
