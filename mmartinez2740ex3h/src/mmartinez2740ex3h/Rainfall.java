package mmartinez2740ex3h;

public class Rainfall {
	private double[] rainfallArray;
	private String[] strrainfallArray;
	public Rainfall (double[] r)
	{
		rainfallArray = new double [r.length];
				
		for (int index = 0; index < r.length; index++)
			rainfallArray[index] = r[index];
	}
	
	public Rainfall (String[] rainfall)
	{
		strrainfallArray = new String[rainfall.length];
		for (int index = 0; index < rainfall.length; index++)
			strrainfallArray[index] = rainfall[index];
	}
	
	
	public double getTotal()
	{
		double total = 0.0;
		
		for (double value : this.rainfallArray)
			total += value;
			
		return total;
	}
	
	public double getTotalFromStrArray()
	{
		double total = 0.0;
		for(String value : this.strrainfallArray)
		{
			total += Double.parseDouble(value); 
		}
		return total;
	}
	
	public double getAverage()
	{
		return getTotal() / this.rainfallArray.length; 
	}
	
	public double getAverageFromStrArray()
	{
		return getTotalFromStrArray() / this.strrainfallArray.length;
	}
	
	
	public double getHighest()
	{
		double highest = this.rainfallArray[0];
		for (int index = 1; index < this.rainfallArray.length; index++)
		{
			if (this.rainfallArray[index] > highest)
			highest = this.rainfallArray[index];
		}
			return highest;
	}
	
	public double getHighestFromStrArray()
	{
		double highest = Double.parseDouble(this.strrainfallArray[0]);
		for (int index = 1; index < this.strrainfallArray.length; index++)
		{
			if (Double.parseDouble(this.strrainfallArray[index]) > highest)
			{
				highest = Double.parseDouble(this.strrainfallArray[index]);
			}
				
		}
			return highest;
	}
	
	
	public double getLowest()
	{
	double  lowest = this.rainfallArray[0];
	
	for (int index = 1; index < this.rainfallArray.length; index++)
	{
			if (rainfallArray[index] < lowest)
				lowest =  this.rainfallArray[index];
	}
		return lowest; 
	
	
	}
	
	public double getLowestFromStrArray()
	{
		double lowest = Double.parseDouble(this.strrainfallArray[0]);
		for (int index = 1; index < this.strrainfallArray.length; index++)
		{
			if (Double.parseDouble(this.strrainfallArray[index]) < lowest)
			{
				lowest = Double.parseDouble(this.strrainfallArray[index]);
			}
				
		}
			return lowest;
	}
	
}
