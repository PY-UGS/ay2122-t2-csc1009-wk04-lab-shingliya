import java.util.Scanner;
public class TestBMI
{
	public static void main(String[] args)
	{
		BMI bmi = new BMI();	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		bmi.setWeight(scan.nextDouble());

		System.out.print("Enter height in inches: ");
		bmi.setHeight(scan.nextDouble());

		System.out.println("BMI is " + bmi.getBMI());
		System.out.println(bmi.getInterpretation());
	}
}