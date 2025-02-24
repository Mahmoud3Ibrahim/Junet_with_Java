import static org.junit.Assert.*;
import org.junit.Test;
	/**
 	 * This Class is to Test the methods of Finess Tracker Program and its methods
 	 * the methods is: CalcDistance() , calcWeeklyActiveMinutes () , determineActiveLevel() , 
 	 * calcMaintenanceCalories()  it has 11 test cases for 
	 * This is part of Assignment01 Tasks.
	 * Course: CST8284 - Lab 321
	 * Professor : Dr. Leanne Seaward
	 * @author - Mahmoud Ibrahim #ID: 041163059
	 * @see FitnessTracker
	 * @see FitnessTrackerTest
	 * @version 1.0.0
	 * @since java 21.0.4
	 */
public class FitnessTrackerTest2 {
	/**
	 * Constant for acceptable floating-point error.
	 */
	public static final double EPSILON = 1E-12;		
	/**
	 * Testing for the steps and Calculating the distance method calcDistance()
	 * For male every step equals 0.8 meter
	 * 4000 *0.8 = 3200
	 */		
	@Test
	//Using assert Equals
	public void testCalcDistance() {		   
		FitnessTracker check1 = new FitnessTracker ("Mark","Zuckerberg","male",4000,150,2500,1000);
		assertEquals(3200.0, check1.calcDistance(), EPSILON );
	}
	/**
	 *  another Test for the steps and Calculating the distance method calcDistance()
	 * for female every step equals 0.7 meter
	 * 4000 * 0.7 = 2800 
	 */
	// Using assertTrue method with Epsilon
	@Test	
	public void testCalcDistance2() {		    
		FitnessTracker check2 = new FitnessTracker ("Salma","Hayek","Female",4000,200,1500,3000 );
		assertTrue( "Calculation is right ",Math.abs( 2800.0 - check2.calcDistance()) < EPSILON );
			}
	
	/**
	 * Testing weekly active minutes method calcWeeklyActiveMinutes()
	 * active minutes weekly = active minutes daily * 7
	 */
	@Test  //Using asserEquals with String Message "that is right"
	public void testCalcWeeklyActiveMinutes() {
		FitnessTracker check3 = new FitnessTracker ("Tim","Horton","Male",4000,150,2500,1000);
	assertEquals("That is right", 1050 , check3.calcWeeklyActiveMinutes() , EPSILON );
	}
	/**
	 * another Test for weekly active minutes method calcWeeklyActiveMinutes()
	 * active minutes weekly = active minutes daily * 7
	 */
	@Test //Using assertEquals without String 
	public void testCalcWeeklyActiveMinutes2() {
		FitnessTracker check4 = new FitnessTracker ("Mohamed","Aly","male",4000,100,2500,1000);
	assertEquals( 700 , check4.calcWeeklyActiveMinutes() , EPSILON );
	}
	
	/**
	 * Testing activity level the method determineActiveLevel ()
	 * Active: More than 150 minutes per week and over 2000 calories burned.
	 */
	
	@Test //Using assertFalse method 
	public void testDetermineActiveLevel() {      
		FitnessTracker check5 = new FitnessTracker ("Johny","Depp","Male",4000,50,2100,0 );
		assertFalse(! check5.determineActiveLevel().equals("Active"));
	}
	/**
	 * another Testing activity level the method determineActiveLevel ()
	 * Moderate: 75-150 minutes per week
	 */
	
	@Test //Using assertEquals with String
	public void testDetermineActiveLevel2() {     
		FitnessTracker check6 = new FitnessTracker ("Winston","Churchill" ,"Male",500,50,1800,0 );
		assertEquals("Test Success" , "Moderately Active" , check6.determineActiveLevel()   );	
	}
	
	/**
	 * another Testing activity level the method determineActiveLevel ()
	 * Moderate: 1000-2000 calories burned.
	 */
	
	@Test //Using asserTrue
	public void testDetermineActiveLevel3() {     
		FitnessTracker check7 = new FitnessTracker ("Celine","Dion","Female",750,15,3000,0 );
		assertTrue(check7.determineActiveLevel().equalsIgnoreCase("Moderately Active"));	
	}
	
	/**
	 * another Testing activity level the method determineActiveLevel ()
	 * Sedentary: Less than 75 minutes per week and under 1000 calories burne
	 */
	
	@Test //Using assertEquals
	public void testDetermineActiveLevel4() {    
		FitnessTracker check8 = new FitnessTracker ("Justin","trudeau","Male",555,10,900,190000 );
		assertEquals("Sedentary" , check8.determineActiveLevel()   );	
	}

	  /**
     * Testing the calculation of maintenance calories for a user.
     * This test checks if the method correctly calculates the calorie deficit or surplus.
     * Expected result: -1500 (500 - 2000).
     */
	
	@Test //Using assertEquals
	public void testCalcMaintenanceCalories() {     
		FitnessTracker check9 = new FitnessTracker ("Charlie", "Chaplin", "Male", 16, 10, 2000, 500);
		assertEquals(-1500  , check9.calcMaintenanceCalories() , EPSILON  );	
	}

	 /**
     * Testing the calculation of maintenance calories when burned calories
     * and maintenance calories are equal.
     * Expected result: 0 (1000 - 1000).
     */
	@Test //Using assertEquals
	public void testCalcMaintenanceCalories2() {   
		FitnessTracker check10 = new FitnessTracker ("Mark", "ruffalo", "Male", 360, 10, 1000, 1000);;
		assertEquals( 0  , check10.calcMaintenanceCalories() , EPSILON  );	
	}
	 /**
     * Testing the calculation of maintenance calories when maintenance calories 
     * exceed burned calories.
     * Expected result: 400 (900 - 500).
     */
	@Test //Using assertEquals
	public void testCalcMaintenanceCalories3() {    
		FitnessTracker check11 = new FitnessTracker ("Idris","Elba", "Male",850,10,500,900);
		assertEquals( 400  , check11.calcMaintenanceCalories() , EPSILON  );	
	}
	
}
