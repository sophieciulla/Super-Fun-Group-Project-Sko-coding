import java.io.*;
public class CalculateGPA 
{
	public static String[] array;
	
	static double gradeValueOne;
	static double gradeValueTwo;
	static double gradeValueThree;

	
	public static void calculateGPAThree()
	{
	if (array[7].equals("A") || array[7].equals("A+"))
		{
		gradeValueThree = 4;
		}
	else if (array[7].equals("A-"))
		{
		gradeValueThree = 3.7;
		}
	else if (array[7].equals("B+"))
		{
		gradeValueThree = 3.3;
		}
	else if (array[7].equals("B"))
		{
		gradeValueThree = 3;
		}
	else if (array[7].equals("B-"))
		{
		gradeValueThree = 2.7;
		}
	else if (array[7].equals("C+"))
		{
		gradeValueThree = 2.3;
		}
	else if (array[7].equals("C"))
		{
		gradeValueThree = 2;
		}
	else if (array[7].equals("C-"))
		{
		gradeValueThree = 1.7;
		}
	else if (array[7].equals("D+"))
		{
		gradeValueThree = 1.3;
		}
	else if (array[7].equals("D"))
		{
		gradeValueThree = 1;
		}
	else
		{
		gradeValueThree = 0;
		}
	}

	public static void calculateGPATwo()
	{
	if (array[5].equals("A") || array[5].equals("A+"))
		{
		gradeValueTwo = 4;
		}
	else if (array[5].equals("A-"))
		{
		gradeValueTwo = 3.7;
		}
	else if (array[5].equals("B+"))
		{
		gradeValueTwo = 3.3;
		}
	else if (array[5].equals("B"))
		{
		gradeValueTwo = 3;
		}
	else if (array[5].equals("B-"))
		{
		gradeValueTwo = 2.7;
		}
	else if (array[5].equals("C+"))
		{
		gradeValueTwo = 2.3;
		}
	else if (array[5].equals("C"))
		{
		gradeValueTwo = 2;
		}
	else if (array[5].equals("C-"))
		{
		gradeValueTwo = 1.7;
		}
	else if (array[5].equals("D+"))
		{
		gradeValueTwo = 1.3;
		}
	else if (array[5].equals("D"))
		{
		gradeValueTwo = 1;
		}
	else
		{
		gradeValueTwo = 0;
		}
	}
	
	public static void calculateGPAOne()
	{
	if (array[3].equals("A") || array[3].equals("A+"))
		{
		gradeValueOne = 4;
		}
	else if (array[3].equals("A-"))
		{
		gradeValueOne = 3.7;
		}
	else if (array[3].equals("B+"))
		{
		gradeValueOne = 3.3;
		}
	else if (array[3].equals("B"))
		{
		gradeValueOne = 3;
		}
	else if (array[3].equals("B-"))
		{
		gradeValueOne = 2.7;
		}
	else if (array[3].equals("C+"))
		{
		gradeValueOne = 2.3;
		}
	else if (array[3].equals("C"))
		{
		gradeValueOne = 2;
		}
	else if (array[3].equals("C-"))
		{
		gradeValueOne = 1.7;
		}
	else if (array[3].equals("D+"))
		{
		gradeValueOne = 1.3;
		}
	else if (array[3].equals("D"))
		{
		gradeValueOne = 1;
		}
	else
		{
		gradeValueOne = 0;
		}
	}
}
