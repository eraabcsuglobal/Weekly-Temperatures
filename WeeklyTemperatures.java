import java.util.Scanner;  // Import the Scanner class

public class WeeklyTemperatures {
	
	public static void main(String args[])
	{
	
		//Develop a Java program that will store data in the form of daily average temperatures for one week.
		
		//Store the day and average temperature in two different arraylists. 
		String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int averageTemperature[] = {66, 55, 80, 88, 87, 60, 58};
		
		String dayToRequest;
		int averageTempForDay = 0;
		int weeklyAvgTemp = 0;


		//Your program should prompt the user for the day of the week (Monday through Sunday)
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter a day of the week: ");
		
		dayToRequest = userInput.nextLine();
		//If "week" is entered, the output for your program should provide the temperature for each day 
		//and the weekly average. 
		if (dayToRequest.equalsIgnoreCase("week"))
		{
			for (int i = 0; i < days.length; i++)
			{
				System.out.println("Day: " + days[i]);
				System.out.println("Average Temperature: " + averageTemperature[i]);
				weeklyAvgTemp += averageTemperature[i];
			}
			
			System.out.println("Weekly Average Temperature: " + weeklyAvgTemp / averageTemperature.length);
		}
		else
		{
			for (int i = 0; i < days.length; i++)
			{
				if (days[i].equalsIgnoreCase(dayToRequest))
				{
					averageTempForDay = averageTemperature[i];
				}
			}
			//and display both the day and temperature for each day. 
			System.out.println("Day: " + dayToRequest);
			System.out.println("Average Temperature: " + averageTempForDay);
		}
		
	}
}
