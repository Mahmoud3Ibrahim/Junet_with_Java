
      /**
  	 *This Class is to Calculate all the Fitness Elements based on the required
	 * this is part of Assignment01 Tasks.
	 * it has the instance variables, the constructor, and the calculation methods.
	 * Course: CST8284 - Lab 321
	 * Professor : Dr. Leanne Seaward
	 * @author - Mahmoud Ibrahim #ID: 041163059
	 * @see FitnessTrackerTest
	 * @see FitnessTrackerTest2
	 * @version 1.0.0
	 * @since java 21.0.4 
	 */
// FitnessTracker.java
// Starter code for FitnessTracker assignment.
public class FitnessTracker {
    // TODO 1: INCLUDE YOUR ATTRIBUTES HERE. CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.
    // START CODE
	/**
	 *  Decleration of the instance variables for the Class
	 */
	private String firstName;
	private String lastName;
	private String gender;
	private int dailySteps;
	private int caloriesBurned;
	private int activeMinutesDaily;
	private int maintenanceCalories;
    // END CODE	
    // TODO 2: INCLUDE YOUR CONSTRUCTOR HERE.
    // START CODE
	/**
	 * default Constructor without arguments
	 */
	
	public FitnessTracker() {
		
	}
	
	/**
	 * The Main Constructor for The program with paramiters for all the needed 
	 * instances 
	 * @param firstName first name of the user
	 * @param lastName last name of the user
	 * @param gender the gender of the user (male / female )
	 * @param dailySteps Number of steps daily
	 * @param caloriesBurned calories burned daily
	 * @param activeMinutesDaily active minutes per day
	 * @param maintenanceCalories maintenance calories required.
	 */

	public FitnessTracker(String firstName, String lastName, String gender, int dailySteps, 
			int activeMinutesDaily, int caloriesBurned, int maintenanceCalories) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dailySteps = dailySteps;
		this.caloriesBurned = caloriesBurned;
		this.activeMinutesDaily = activeMinutesDaily;
		this.maintenanceCalories = maintenanceCalories;
	}
	
	// END CODE
    // TODO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS DIAGRAM TO ENSURE ALL ARE COMPLETE.
	// START CODE
	/**
	 * Gets the first name of the user.
	 * @return first name of the user
	 */
	public String getfirstName() {
	    return firstName;
	}

	/**
	 * Sets the first name of the user.
	 * @param firstName The first name to set
	 */
	public void setfirstName(String firstName) {
	    this.firstName = firstName;
	}

	/**
	 * Gets the last name of the user.
	 * @return last name of the user
	 */
	public String getlastName() {
	    return lastName;
	}

	/**
	 * Sets the last name of the user.
	 * @param lName The last name to set
	 */
	public void setlastName(String lName) {
	    this.lastName = lName;
	}

	/**
	 * Gets the gender of the user.
	 * @return gender of the user
	 */
	public String getGender() {
	    return gender;
	}

	/**
	 * Sets the gender of the user.
	 * @param gender The gender to set
	 */
	public void setGender(String gender) {
	    this.gender = gender;
	}

	/**
	 * Gets the number of daily steps taken by the user.
	 * @return daily steps count
	 */
	public int getDailySteps() {
	    return dailySteps;
	}

	/**
	 * Sets the number of daily steps taken by the user.
	 * @param dailySteps The daily steps count to set
	 */
	public void setDailySteps(int dailySteps) {
	    this.dailySteps = dailySteps;
	}

	/**
	 * Gets the number of calories burned by the user.
	 * @return calories burned
	 */
	public int getCaloriesBurned() {
	    return caloriesBurned;
	}

	/**
	 * Sets the number of calories burned by the user.
	 * @param caloriesBurned The calories burned to set
	 */
	public void setCaloriesBurned(int caloriesBurned) {
	    this.caloriesBurned = caloriesBurned;
	}

	/**
	 * Gets the number of active minutes per day.
	 * @return active minutes per day
	 */
	public int getActiveMinutDaily() {
	    return activeMinutesDaily;
	}

	/**
	 * Sets the number of active minutes per day.
	 * @param activeMinutDaily The active minutes per day to set
	 */
	public void setActiveMinutesDaily(int activeMinutDaily) {
	    this.activeMinutesDaily = activeMinutDaily;
	}

	/**
	 * Gets the maintenance calories required for the user.
	 * @return maintenance calories
	 */
	public int getMaintenanceCalories() {
	    return maintenanceCalories;
	}

	/**
	 * Sets the maintenance calories required for the user.
	 * @param maintenanceCalories The maintenance calories to set
	 */
	public void setMaintenanceCalories(int maintenanceCalories) {
	    this.maintenanceCalories = maintenanceCalories;
	}



    // END CODE
    // TODO 4: THIS METHOD SHOULD DISPLAY ALL USER FITNESS DATA. DO NOT MISS ANY DATA/INFORMATION.
	   
    // TODO 5: USE System.out.printf TO SHOW ALL FITNESS DATA. DO NOT MISS ANY ITEM.

    // START CODE
	/**
	 * Calculates the distance walked based on daily steps.
	 * Males: each step = 0.8 meters.
	 * Females: each step = 0.7 meters.
	 * @return distance walked in meters
	 */
	public double calcDistance() {		
		double distanceWalked =0;
		//calculation for female (steps *0.7)
		if (gender.equalsIgnoreCase("Female")) {
			distanceWalked = dailySteps * 0.7 ;
		//calculation for male ( steps *0.8 )
		}else if (gender.equalsIgnoreCase("Male")) {
			distanceWalked = dailySteps *0.8 ;
			}
		return distanceWalked;		
	}

	/**
	 * Calculates weekly active minutes by multiplying daily active minutes by 7.
	 *
	 * @return Weekly active minutes.
	 */

	public double calcWeeklyActiveMinutes () {
		double weekly;
		weekly = activeMinutesDaily * 7 ;
		return weekly;
	}
	
	/**
	 * Determines the activity level based on weekly active minutes and calories burned.
	 * - Active: More than 150 minutes per week and over 2000 calories burned.
	 * - Moderate: 75-150 minutes per week or 1000-2000 calories burned.
	 * - Sedentary: Less than 75 minutes per week and under 1000 calories burned.
	 * @return The activity level as a string: "Active", "Moderate", or "Sedentary".
	 */
	public String determineActiveLevel() {	
		double weeklyMinutes = calcWeeklyActiveMinutes ();
		String activeLevel = null;		
	if ( weeklyMinutes > 150  && caloriesBurned > 2000) {
		activeLevel = "Active" ;
		} else if ( (weeklyMinutes <= 150 &&  weeklyMinutes >= 75 ) || (caloriesBurned <= 2000 && caloriesBurned >= 1000 )) {
			activeLevel = "Moderately Active" ;
		} else if (weeklyMinutes  < 75 && caloriesBurned < 1000 ) {
			activeLevel = "Sedentary";
		}
	return activeLevel;
	}
	
	
	/**
	 * method calculate the deficit or surplus calories 
	 * it is the difference between maintained calories and burned calories
	 * @return calculated Calories
	 */
	
	public int calcMaintenanceCalories () {
		int calculatedCalories = maintenanceCalories - caloriesBurned;
		return calculatedCalories;
	}
	
	/**
	 * a void method to print all the data after calculation
	 */

	
	 public void displayFitnessData() {
	    	System.out.printf("First Name: %s%n" , firstName );
	    	System.out.printf("Last Name: %s%n" , lastName );
	    	System.out.printf("Gender:%s%n", gender);
	    	System.out.printf("Dailysteps : %d%n" , dailySteps );
	    	System.out.printf("Distance Walked: %.1f meters %n" , calcDistance() );
	    	System.out.printf("Weekly Active Minutes: %.1f%n" , calcWeeklyActiveMinutes () );
	    	System.out.printf("Fitness Level: %s%n" , determineActiveLevel() );
	     	System.out.printf("Daily calorie Deficit/surplus: %d%n" , calcMaintenanceCalories () );
        // END CODE

        // You do not need to modify this piece of code; it is fine as it is.
        System.out.println("Fitness Level Criteria:");
        System.out.println("Active: More than 150 active minutes per week and over 2000 calories burned.");
        System.out.println("Moderately Active: 75-150 Active minutes per week or 1000-2000 calories burned.");
        System.out.println("Sedentary: Less than 75 Active minutes per week and under 1000 calories burned.");
    }

} // end class FitnessTracker