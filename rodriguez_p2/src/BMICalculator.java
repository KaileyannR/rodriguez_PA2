// Kaileyann Rodriguez
// COP 3330
// Programming Assignment 2

import java.util.Scanner;
public class BMICalculator
{
	// Returns and calculations will be in imperial units.
	public static  double weight = 0;
	public static double height = 0;
	public static double BMI = 0;
	public static String BmiCategory;

	// Provides user data about which BMI calculator they would like to use.
	// Calls method readUnitType() to scan which BMI calculator.
	public static void readUserData()
	{
		System.out.println("A) Metric Units");
		System.out.println("B) Imperial Units");
		System.out.println("Input A or B to select which BMI Calculator to use: ");
		String unitType = readUnitType();
		readMeasurementData(unitType);
	}

	// Scans for users BMI calculator choice.
	private static String readUnitType()
	{
		Scanner BMIChoice = new Scanner(System.in);
		String choice = BMIChoice.nextLine();
		return choice;
	}

	// Based on users BMI choice, method calls either readMetricData or
	// calls readImperialData.
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

	// Scans users input of metric weight and height then converts data to standard.
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

	// Scans users input of imperial weight and height.
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

	// Completes calculations of weight and height (in imperial) to get users BMI.
	public static void calculateBmi()
	{
		BMI = ((703 * weight) / (height * height));
	}

	// Uses users BMI to calculate BMI category.
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

	// Prints BMI and BMI categry.
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

	// Used to test code.
	// public static void main (String [] args)
	// {
	// 	readUserData();
	// 	calculateBmi();
	// 	displayBmi();
	// }
}
