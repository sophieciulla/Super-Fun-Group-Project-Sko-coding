import java.io.IOException;
import java.util.Scanner;
public class ChangeGrades
	{
//		public static void main(String[] args) throws IOException
//			{
//				changeGrades();
//			}
		public static void changeGrades()
			{
				java.util.Scanner userInput = new Scanner(System.in);
				
				for(int i = 1; i<MainMenu.students.size(); i++)
					{
				System.out.println(i + MainMenu.students.get(i).getFirstName() + MainMenu.students.get(i).getLastName());
					}
			
			}
	}
