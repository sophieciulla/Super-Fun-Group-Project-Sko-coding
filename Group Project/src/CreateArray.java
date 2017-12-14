import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;
public class CreateArray
{
	public static String[] array;
	static double GPA;
	static double gradeValueOne;
	static double gradeValueTwo;
	static double gradeValueThree;
	
	public static void createArray() throws IOException
	{
	Scanner file = new Scanner( new File( "studentList.txt" ) );
	while (file.hasNextLine())
		{
		String line = file.nextLine();
		array = line.split(" "); 
		calculateGPAOne();
		calculateGPATwo();
		calculateGPAThree();
		DecimalFormat df = new DecimalFormat("0.00");
		GPA = (gradeValueOne + gradeValueTwo + gradeValueThree) / 3;
		MainMenu.students.add(new Group (array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], df.format(GPA)));
		
		}
	}	
	
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


