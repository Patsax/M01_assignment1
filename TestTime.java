// Define a test class for the Time class
public class TestTime {
    // Define the main method
    public static void main(String[] args) {
        // Create a Time object using the default constructor
        Time time1 = new Time();
        // Create a Time object using the parameterized constructor with the elapsed time
        Time time2 = new Time(555550000);
        // Create a Time object using the parameterized constructor with the specified second, minute & hour
        Time time3 = new Time(5, 23, 55);

        // Display the time of the three Time object
        System.out.printf("%d:%d:%d\n", time1.getHour(), time1.getMinute(), time1.getSecond());
        System.out.printf("%d:%d:%d\n", time2.getHour(), time2.getMinute(), time2.getSecond());
        System.out.printf("%d:%d:%d\n", time3.getHour(), time3.getMinute(), time3.getSecond());
    }
}

