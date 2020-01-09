package com.cSam.classes;

 public class Account {
	 // i need 2 arrays one for each account one for balance
	 int[] account = {1,2,3,4,5,6,7,8,9,10};
	 double[] balance = {100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0};
	 int acct;
	 public Account () {
		 
	 }
	 public Account (int i) {
		 acct = i;
	 }
	 
	 public double withDraw (double amt) {
		 balance[acct - 1] -= amt;
		 return (balance[acct - 1] - amt);
	 }
	 public double deposit (double amt) {
		 balance[acct - 1] += amt;
		 return (balance[acct - 1] + amt);
		 
	 }	 
	 public double checkBalance() {
		 return balance[acct - 1];
	 }
}
