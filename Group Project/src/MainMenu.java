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
			}

		private static void createArray() throws IOException
			{
			Scanner file = new Scanner( new File( "studentList.txt" ) );
			while (file.hasNextLine())
				{
				String line = file.nextLine();
				String[] array = line.split(" ");
				students.add(new Group (array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7]));
				}		
			}

	}
