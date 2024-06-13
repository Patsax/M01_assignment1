// Define a class named Time
public class Time {
	// Declare the required data fields
	private int hour, minute, second;

	// Define a no-arg constructor
	Time() {
        // Set the time to the system's current time
		setTime(System.currentTimeMillis());	
	}

	// Define a parameterized constructor that receives a specified elapsed time
	// since midnight, January 1, 1970, in milliseconds
	Time(long elapsedTime) {
        // Set the time to the given elapsed time
		setTime(elapsedTime);
	}

	// Define a parameterized constructor that receives a specified hour, minute & second
	Time(int hour, int minute, int second) {
        // Set the data fields to the given parameters
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// Define a getter method for the hour field
	public int getHour() { return hour; }

	// Define a getter method for the minute field
	public int getMinute() { return minute; }

	// Define a getter method for the second field
	public int getSecond() { return second; }

	// Define a method that sets a new time to the recived elapsed time
	public void setTime(long elapsedTime) {
        // Extract the total number of seconds from the given elapsed time
		long numSeconds = elapsedTime / 1000;
        // Extract the total number of minutes from the given elapsed time
        long numMinutes = numSeconds / 60;
        // Extract the total number of hours from the given elapsed time
        long numHours = numMinutes / 60;

        // Compute the second value from the computed total no. of seconds
		second = (int)(numSeconds % 60);
        // Compute the minute value from the computed total no. of minutes
		minute = (int)(numMinutes % 60);
        // Compute the hour value from the computed total no. of hours
		hour = (int)(numHours % 24);
	}
}

