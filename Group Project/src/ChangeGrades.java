import java.io.IOException;
import java.util.Scanner;
public class ChangeGrades
	{

		public static void changeGrades()
			{
				java.util.Scanner userInput = new Scanner(System.in);
				
				for(int i = 0; i<MainMenu.students.size(); i++)
					{
				System.out.println((i+1) + " "+  MainMenu.students.get(i).getFirstName() + MainMenu.students.get(i).getLastName());
					}
			
			}
	}
