import java.util.Scanner;

	/**
	 * This Class is the main class to execute the program of fitness tracker
	 * Assignment 01 Tasks.
	 * it has the instance variables, the constructor, and the calculation methods. 
	 * Course: CST8284 - Lab 321
	 * Professor : Dr. Leanne Seaward
	 * @author - Mahmoud Ibrahim #ID: 041163059
	 * @see FitnessTracker
	 * @see FitnessTrackerTest2
	 * @version 1.0.0
	 * @since java 21.0.4
	 */
public class FitnessTrackerTest {	
	/**
	 * this is the main main method where execution starts
	 * @param args command -line arguments (not used)
	 */
public static void main (String[] args) {
	
	/**
	 * Creating a Scanner object to receive data from the user
	 */
	Scanner input = new Scanner (System.in);
	FitnessTracker fitnessTracker = new 	FitnessTracker(null, null, null, 0, 0, 0, 0) ;
	
	/**
	 * Receiving first name from the user
	 */
	String firstname;
	System.out.print("Enter Your First Name:");
	firstname = input.nextLine();
	fitnessTracker.setfirstName(firstname);
	
	
	/**
	 * Receiving the Last Name from the user 
	 */
	String lastname;
	System.out.print("Enter Your Last Name:");
	lastname = input.nextLine();
	fitnessTracker.setlastName(lastname);
	
	
	/**
	 * Receiving the gender from the user
	 */
	String gender;
	System.out.print("Enter Your Gender:");
	gender= input.nextLine();	
	fitnessTracker.setGender(gender); 
	
	/**
	 * Receiving the daily steps from the user
	 */
	
	int steps;
	System.out.print("Enter Daily Steps:");
	steps = input.nextInt();
	fitnessTracker.setDailySteps(steps);
	input.nextLine();
	
	/**
	 * Receiving the Calories Burned from the user
	 */
	int calories;
	System.out.print("Enter Daily Calories Burned:");
	calories = input.nextInt();
	fitnessTracker.setCaloriesBurned(calories);
	input.nextLine();
	
	/**
	 * Receiving the daily active minutes from the user
	 */
	int minutes;
	System.out.print("Enter daily active minutes:");
	minutes= input.nextInt();
	fitnessTracker.setActiveMinutesDaily(minutes);
	input.nextLine();
	
	/**
	 * Receiving the daily maintenance calories from the user
	 */
	int maintenanceCalories;
	System.out.printf("Enter daily maintenance calories:");
	maintenanceCalories = input.nextInt();
	fitnessTracker.setMaintenanceCalories(maintenanceCalories);
	input.nextLine();
	
	/**
	 *  Calling the method to display calculations and print the final report
	 */
	
	System.out.printf("%n--User Fitness Data--%n");
	fitnessTracker.displayFitnessData();
	
	input.close();

}}