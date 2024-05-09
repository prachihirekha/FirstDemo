package conditional;
import java.util.Scanner;

public class NumbersOfDayInMonth {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input month and year
	        System.out.print("Enter the month (1-12): ");
	        int month = scanner.nextInt();
	        System.out.print("Enter the year: ");
	        int year = scanner.nextInt();
	        
	        // Check if the input month is valid
	        if (month < 1 || month > 12) {
	            System.out.println("Invalid month. Please enter a month between 1 and 12.");
	            return;
	        }
	        
	        // Calculate the number of days based on the month and year
	        int daysInMonth = getDaysInMonth(month, year);
	        System.out.println("Number of days in the month: " + daysInMonth);
	        
	        scanner.close();
	    }
	    
	    // Method to calculate the number of days in a month
	    public static int getDaysInMonth(int month, int year) {
	        switch (month) {
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                return 31;
	            case 4: case 6: case 9: case 11:
	                return 30;
	            case 2:
	                // Check for leap year
	                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	                    return 29;
	                else
	                    return 28;
	            default:
	                return -1; // Invalid month
	        }
	    }
	
	}

