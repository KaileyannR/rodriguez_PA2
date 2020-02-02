// Kaileyann Rodriguez
// COP 3330
// Programming Assignment 2

import java.util.Scanner;
public class BMICalculator
{
	//return and calculations will be in imperial units
	public static  double weight = 0;
	public static double height = 0;
	public static double BMI = 0;
	public static String BmiCategory;


	public static void readUserData()
	{
		System.out.println("A) Metric Units");
		System.out.println("B) Imperial Units");
		System.out.println("Input A or B to select which BMI Calculator to use: ");
		String unitType = readUnitType();
		readMeasurementData(unitType);
	}

	private static String readUnitType()
	{
		Scanner BMIChoice = new Scanner(System.in);
		String choice = BMIChoice.nextLine();
		return choice;
	}

	private static void readMeasurementData(String unitType)
	{
		if(unitType.equals("A"))
		{
			readMetricData();
		}
		else if(unitType.equals("B"))
		{
			readImperialData();
		}
	}

	private static void readMetricData()
	{
		double iWeight = 0;
		double iHeight = 0;
		Scanner metricInfo = new Scanner(System.in);

		System.out.println("Input Weight in Kilograms: ");
		double metricWeight = metricInfo.nextDouble();
		System.out.println("Input Height in Meters: ");
		double metricHeight = metricInfo.nextDouble();

		iWeight = (metricWeight * 2.2);
		iHeight = (metricHeight * 39.37);

		setWeight(iWeight);
		setHeight(iHeight);
	}

	private static void readImperialData()
	{
		Scanner imperialInfo = new Scanner(System.in);

		System.out.println("Input Weight in Pounds: ");
		double imperialWeight = imperialInfo.nextDouble();
		System.out.println("Input Height in Inches: ");
		double imperialHeight = imperialInfo.nextDouble();

		setWeight(imperialWeight);
		setHeight(imperialHeight);
	}

	public static void calculateBmi()
	{
		BMI = ((703 * weight) / (height * height));
	}

	private static void calculateBmiCategory()
	{
		if(BMI < 18.5)
		{
			BmiCategory = "Underweight";
		}
		else if(BMI >= 18.5 && BMI < 24.9)
		{
			BmiCategory = "Normal Weight";
		}
		else if(BMI >= 25 && BMI < 29.9)
		{
			BmiCategory = "Overweight";
		}
		else if(BMI >= 30)
		{
			BmiCategory = "Obese";
		}
		else
		{
			BmiCategory = "Invaild or Unknown BMI Category.";
		}
	}

	public static void displayBmi()
	{
		calculateBmi();
		calculateBmiCategory();
		System.out.println("BMI: " + BMI);
		System.out.println("BMI Category: " + BmiCategory);
	}

	public static double getWeight()
	{
		return weight;
	}

	private static void setWeight(double input_weight)
	{
		if(input_weight <= 0)
		{
			System.out.println("Invalid weight measurement.");
		}
		else
		{
			weight = input_weight;
		}
	}

	public static double getHeight()
	{
		return height;
	}

	private static void setHeight(double input_height)
	{
		height = input_height;
	}

	public static double getBmi()
	{
		return BMI;
	}

	public static String getBmiCategory()
	{
		return BmiCategory;
	}

	public static void main (String [] args)
	{
		readUserData();
		calculateBmi();
		displayBmi();
	}
}
