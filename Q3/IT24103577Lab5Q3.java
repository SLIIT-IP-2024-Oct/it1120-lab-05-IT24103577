import java.util.Scanner;

public class IT24103577Lab5Q3
{
	public static void main(String[] args)
	{   
	
	    final double chargePerDay =	48000.00 ;
		int reservedDates = 0 ;
		double Amount=0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Start Date (1-31): ");
		int startDate = scan.nextInt();
	
		System.out.print("Enter End Date (1-31): ");
		int endDate = scan.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate >31)
		{System.out.println("Days must be between 1 and 31.");
		return ;
		}
		
		else if(startDate >= endDate)
		{System.out.print("Start Date must be less than End Date.");
	    return ;
		}
    
        System.out.println("Room charge per day : Rs. 48000.00/=" );

		System.out.println("\n");

		  reservedDates = endDate - startDate ;
		 {
	       System.out.println("Number of days reserved: "+ reservedDates);
		}
		
		
		
		if (reservedDates >= 5)
		{ Amount = (chargePerDay*reservedDates)*0.8;
			System.out.print("Total Amount to be paid: "+ Amount);
		}
	
	    else if (reservedDates >=3 && reservedDates <= 4)
		{Amount = (chargePerDay*reservedDates)*0.9;
			System.out.print("Total Amount to be paid: "+ Amount);
		}	
		
		else if(reservedDates<3)
		{System.out.print(Amount);}	
		
	    
		
		System.out.print("\n");
	    
		
    }
}
 