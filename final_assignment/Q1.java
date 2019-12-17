/*
 *     1. The U.S. Census Bureau projects population based on the following assumptions:

    • One birth every 7 seconds 
    • One death every 13 seconds
    • One new immigrant every 45 seconds

Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.


 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cSam
 */
public class Q1 {
  final static int CURRENT_POPULATION = 312032486; //The initial / current population before we start our program.
  final static int BIRTH_RATE = 7; //a birth occurs every 7 Seconds 
  final static int DEATH_RATE = 13; //Death rate is every 13 seconds - people die every 13 seconds
  final static int IMMIGRANT_RATE = 45; // Every 45 minutes, people migrate into the country.
  final static int TOTAL_SECONDS = 3153600; //This is the total seconds in a year
  final static int TOTAL_SECONDS_LEAP_YEAR =31622400; //leap year occurs every four years. 
  //we assumed our year is starting from fresh, taking the fourth year as a leap year. We are to have extra one day 366
  /*60 Seconds make 1 Minute;
   * 60 minutes make 1 hour;
   * 24 hours make one day
   * 365 days make one year
   * 366 days make a leap year - February 29th.
  */
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    long birth, death, immigrant, yearlyCensus, totalCensus = CURRENT_POPULATION;
    //The above statement is used to declare our variables as long data type
    System.out.println("The Populations for each of the next 5 years:- ");
    for(int i = 1; i <= 5; i++) {
    	birth = birthRate(i); //This is a method used to get birth rate
        death = deathRate(i); //This is a method used to get death rate
        immigrant = immigrantRate(i); //This is a method used to get immigrant rate
        yearlyCensus = (birth + immigrant) - death; //This is used to calculate the yearly census;
    	totalCensus += yearlyCensus; //we add up total census to update it for the next year.
    	System.out.println("Population for " + i + " Year is: " + totalCensus);
    	//The above code is used to print out the population for each year.
    }
  }
  public static long birthRate(int i) {//This method helps us with the value of birth population yearly;
    long birth;
    if(i == 4) {//this is for leap year.
    	birth = TOTAL_SECONDS_LEAP_YEAR / BIRTH_RATE;
    } else {
    	birth = TOTAL_SECONDS / BIRTH_RATE;
    }
      
    return birth;
  }
  public static long deathRate(int i) {//This method helps us with the value of death population yearly;
    long death;
    if(i == 4) { //this is for leap year 
    	death = TOTAL_SECONDS_LEAP_YEAR / DEATH_RATE;
    } else {
    	death = TOTAL_SECONDS / DEATH_RATE;
    }
      
    return death;
  }
  public static long immigrantRate(int i) {//This method helps us with the value of immigrant population yearly;
    long immigrant;
    if(i == 4) { //this is for leap year.
    	immigrant = TOTAL_SECONDS_LEAP_YEAR / IMMIGRANT_RATE;
    } else {
    	immigrant = TOTAL_SECONDS / IMMIGRANT_RATE;
    }
      
    return immigrant;
  }
}