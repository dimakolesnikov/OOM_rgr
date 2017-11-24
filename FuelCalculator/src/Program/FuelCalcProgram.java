package Program;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class FuelCalcProgram 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

		double distance = 0;
		double fuelConsumption = 0;
		double fuelCost = 0;
		
		try 
		{
			System.out.print("Enter path length: ");
			distance = sc.nextDouble();

			System.out.print("Enter fuel consumption per 100 km: ");
			fuelConsumption = sc.nextDouble();

			System.out.print("Enter the price of one liter of fuel: ");
			fuelCost = sc.nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input. Please, try again.");
			sc.close();
			
			return;
		}
		
		FuelCalcBL fc = new FuelCalcBL(distance, fuelConsumption, fuelCost);

		System.out.println("--------------------------------");
		System.out.println("Total fuel consumption: " + fc.TotalFuelConsumption + " l.");
		System.out.println("Total amount: " + String.format(new Locale("ru"), "%(.2f", fc.TotalSum) + " rub.");
		
		sc.close();
	}
}