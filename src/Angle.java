/**
 * @author Dion de Jong 
 * @version 1.0 1 February 2014
 * This program receives an angle in degrees and prints the sin and cos
 * using both Math class methods and a method using a Taylor Series. 
 */ 

public class Angle {

	//initialize Variable
	private double InitialDeg = 0; 

	//default constructor
	public Angle() 
	{
		this.InitialDeg = 0; 
	} 

	//constructor
	public Angle(double Angle) 
	{
		this.InitialDeg = Angle;
	} 

	//getter
	public double getInitialDeg() 
	{
		return this.InitialDeg;
	}

	//setter that makes the angle into the range of 0-360
	public void setInitialDeg(double Angle)
	{
		while (Angle >= 360 || Angle <= -360)
		{
			if (Angle >= 360)
			{
				Angle = Angle-360;
			}
			else if (Angle <= -360)
			{
				Angle = Angle+360;
			}
		}
		this.InitialDeg = Angle;
	}

	//print method for the angle
	public void PrintResult(double Angle)
	{
		this.InitialDeg = Angle;
		System.out.println("The value of the angle is: " + InitialDeg);
	}

	//solve for sin using the math package
	public double Sin()
	{
		double x = Math.toRadians(getInitialDeg());
		return Math.sin(x); 
	}

	//solve for cos using the math package
	public double Cos() 
	{
		double x = Math.toRadians(getInitialDeg());
		return Math.cos(x); 
	}

	//Method that creates the factorial of a number
	public static double Factorial(double number)
	{
		double Factorial = 1; 

		if (number == 0)
		{
			return Factorial; 
		}

		while (number >= 1)
		{
			Factorial = Factorial*number; 
			number--; 
		}

		return Factorial;
	}

	//Solve for sin using the taylor series equation
	public double MySin(int n) 
	{	 
		double x = Math.toRadians(getInitialDeg());
		double SumSin = 0;
		for (int i = 0; i < n; i++)
		{
			SumSin += Math.pow(-1, i)*Math.pow(x, 2*i+1)/Factorial(2*i+1);
		}
		return SumSin;
	}

	//Solve for cos using the taylor series equation
	public double MyCos(int n)
	{
		double x = Math.toRadians(getInitialDeg());
		double SumCos = 0;
		for (int i = 0; i < n; i++)
		{
			SumCos += Math.pow(-1, i)*Math.pow(x, 2*i)/Factorial(2*i);
		}
		return SumCos;
	}

}