# Junet_with_Java
 this project was an assignment i did for Junet
The Fitness Tracker project is designed to calculate and display various fitness-related data for users, based on their daily activity. It tracks information such as the number of steps taken, calories burned, active minutes, and calculates overall fitness metrics like distance walked, activity level, and calorie surplus or deficit. This project is part of Assignment 01 for the CST8284 - Lab 321 course.

Features
User Profile: Collects user's first name, last name, gender, daily steps, calories burned, active minutes, and maintenance calories.
Distance Calculation: Calculates the distance walked based on daily steps, with gender-based step-to-meter conversion.
Activity Level: Determines the activity level (Active, Moderately Active, Sedentary) based on weekly active minutes and calories burned.
Calorie Deficit/Surplus: Calculates the difference between maintenance calories and burned calories, providing the user's calorie status.
Fitness Data Display: Displays all the collected and calculated fitness data for the user.
Requirements
Java 21.0.4 or later
JUnit 5 for testing
Usage
Clone the repository to your local machine.

Compile the FitnessTracker.java and FitnessTrackerTest.java classes.

Run the FitnessTrackerTest class to interact with the program. The program will prompt you to enter the following information:

First Name
Last Name
Gender (Male/Female)
Daily Steps
Daily Calories Burned
Daily Active Minutes
Maintenance Calories
After entering the data, the program will display:

Distance Walked (based on gender-specific step length).
Weekly Active Minutes.
Fitness Level (Active, Moderately Active, Sedentary).
Daily Calorie Deficit/Surplus.
Example
yaml
Copy
Edit
Enter Your First Name: Mark
Enter Your Last Name: Zuckerberg
Enter Your Gender: Male
Enter Daily Steps: 4000
Enter Daily Calories Burned: 2500
Enter daily active minutes: 150
Enter daily maintenance calories: 2000

--User Fitness Data--
First Name: Mark
Last Name: Zuckerberg
Gender: Male
Daily Steps: 4000
Distance Walked: 3200.0 meters
Weekly Active Minutes: 1050.0
Fitness Level: Active
Daily Calorie Deficit/Surplus: -500
Fitness Level Criteria:
Active: More than 150 active minutes per week and over 2000 calories burned.
Moderately Active: 75-150 Active minutes per week or 1000-2000 calories burned.
Sedentary: Less than 75 Active minutes per week and under 1000 calories burned.
Testing
The project includes a suite of JUnit tests to verify the correctness of the fitness calculation methods:

CalcDistance: Tests the distance calculation based on daily steps for both males and females.
CalcWeeklyActiveMinutes: Verifies the calculation of weekly active minutes (daily active minutes * 7).
DetermineActiveLevel: Tests for correct activity level classification (Active, Moderately Active, Sedentary) based on the weekly minutes and calories burned.
CalcMaintenanceCalories: Checks the calculation of calorie deficit or surplus.
Author
Mahmoud Ibrahim
Student ID: 041163059
License
This project is licensed under the MIT License.

