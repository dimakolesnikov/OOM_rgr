package Program;

public class FuelCalcBL 
{
	private double distance = 0;              
	private double fuelConsumption = 0;       
	private double fuelCost = 0;              
	
	public double TotalFuelConsumption;   
	public double TotalSum;               
	
	public FuelCalcBL(double distance, double fuelConsumption, double fuelCost)
	{
		if (distance <= 0 || fuelConsumption <= 0 || fuelCost <= 0 )
		{
			TotalFuelConsumption = 0;
			TotalSum = 0;
		} 
		else
		{
			this.distance = distance;
			this.fuelConsumption = fuelConsumption;
			this.fuelCost = fuelCost;
			
			Calculate();
		}
	}
	
	private void Calculate()
	{
		TotalFuelConsumption = (distance / 100) * fuelConsumption;
		TotalSum = TotalFuelConsumption * fuelCost;
	}
}
