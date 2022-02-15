import java.lang.Math;

public class BMI
{
	private double pounds, inches;
	public BMI()
	{
		this.pounds = 146;
		this.inches = 70;
	}

	public BMI(double pounds, double inches)
	{
		this.pounds = pounds;
		this.inches = inches;
	}

	public void setWeight(double pounds)
	{
		this.pounds = pounds;
	}

	public double getWeight()
	{
		return this.pounds;
	}

	public void setHeight(double inches)
	{
		this.inches = inches;
	}

	public double getHeight()
	{
		return this.inches;
	}

	public double getBMI()
	{
		return (this.pounds*0.45359237) / Math.pow((this.inches)*0.0254, 2);
	}

	public String getInterpretation()
	{
		double bmi = getBMI();
		
		if(bmi < 18.5)
			return "Underweight";
		else if(bmi < 25.0)
			return "Normal";
		else if(bmi < 30)
			return "Overweight";
		return "Obese";
	}
}