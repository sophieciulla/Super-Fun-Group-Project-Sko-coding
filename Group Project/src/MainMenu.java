
import java.io.*;
import java.util.*;
import java.util.*;

public class MainMenu
	{
		static ArrayList<Group> students = new ArrayList<Group>();
		public static void main(String[] args) throws IOException
			{
			System.out.println("Hello");
			createArray();	
			menuChoice();
			}

		private static void createArray() throws IOException
			{
			Scanner file = new Scanner( new File( "studentList.txt" ) );
			while (file.hasNextLine())
				{
				String line = file.nextLine();
				String[] array = line.split(" "); //hi
				students.add(new Group (array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7]));
				}		
			}	
		
			public static void menuChoice()
			{
				System.out.println("What would you like to do?");
				System.out.println("   1) Add or delete a student");
				System.out.println("   2) Change student grades/schedule");
				System.out.println("   3) Sort students");
			}

	}
