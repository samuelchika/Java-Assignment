package com.cSam.classes;

import java.util.ArrayList;
import java.util.Collections;

public class Factors {
	ArrayList<Integer> nums = new ArrayList<Integer>();
	int number;
	
	public Factors() {}
	public Factors(int num) {
		number = num;
	}
	
	
	public boolean isPrime(int number) {
		int n;
		 
		n = (int)(Math.sqrt(number));
		if(n == 1) {
			return true;
		} else {
			for (int i = 2; i <= n; i++) {
				if(number % i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public void factors() {
		int n;
		 
		n = (int)(Math.sqrt(number));
		if(!this.isPrime(number)) {
			System.out.println(n);
			while(number > 1) {
				if(((number % n) == 0) && (this.isPrime(n))) {
					nums.add(n);
					number /= n;
				} else {
					n--;
				}
			}
		}
		Collections.sort(nums);
		System.out.print("(");
		for(Integer num : nums) {
			System.out.print(num + " ");
		}
		System.out.print(")");
	}
}
