
import java.util.Scanner; 
public class IT24103577Lab5Q1 {

public static void main(String[] args) 
{

Scanner scan = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int num1 = scan.nextInt();

System.out.print("Enter the second integer: ");
int num2 = scan.nextInt();

System.out.print("Enter the third integer: "); 
int num3 = scan.nextInt(); 

System.out.print("\n");

System.out.println("User entered numbers are : " +num1+" " +num2+" " +num3);
//finding smallest number
if (num2>num1 && num3>num1)
{

System.out.println("The Smallest numbers is :"+num1);
}
else if (num1>num2 && num3>num2)
{

System.out.println("The Smallest numbers is :"+num2);
}
else if (num1>num3 && num2>num3)
{

System.out.println("The Smallest numbers is :"+num3);
}

//finding largest number
if (num2<num1 && num3<num1)
{
	System.out.println("the Largest numbers is "+num1);
}
else if (num1<num2 && num3<num2)
{
System.out.println("the Largest numbers is :"+num2);
}
else if (num1<num3 && num2<num3)
{
System.out.println("the Largest numbers is :"+num3);
}
}
}