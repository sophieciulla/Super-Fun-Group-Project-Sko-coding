import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;
public class CreateArray
{
	public static String[] array;
	static double GPA;
	
	public static void createArray() throws IOException
	{
	Scanner file = new Scanner( new File( "studentList.txt" ) );
	while (file.hasNextLine())
		{
		String line = file.nextLine();
		array = line.split(" "); 
		CalculateGPA.calculateGPAOne();
		CalculateGPA.calculateGPATwo();
		CalculateGPA.calculateGPAThree();
		DecimalFormat df = new DecimalFormat("0.00");
		GPA = (CalculateGPA.gradeValueOne + CalculateGPA.gradeValueTwo + CalculateGPA.gradeValueThree) / 3;
		MainMenu.students.add(new Group (array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], df.format(GPA)));
		}	
	}	
}
