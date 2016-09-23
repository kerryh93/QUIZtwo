import java.util.Scanner;

public class Main {
	
	public static double TutionCost;
	public static double PerInc;
	public static double IntRate;

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double TutionCost;
		double PerInc;
		double TotalTution;
		
		System.out.print("How much is your first year tution?");
		TutionCost = input.nextDouble();
		
		TotalTution = TutionCost;
		for ( int i= 0; i< 3; i++)
		{
			System.out.println("What is the percent increase of your tution?");
		}
		//test
		
		input.close();
		
		System.out.printf("Your tution after four years will be $ %.2f ", TotalTution);
		
		
	}
}


