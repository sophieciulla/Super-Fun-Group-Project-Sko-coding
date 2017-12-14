
import java.io.*;
import java.util.*;
import java.text.*;
;public class MainMenu
	{
		static ArrayList<Group> students = new ArrayList<Group>();
		public static void main(String[] args) throws IOException
			{
			System.out.println("Hello");
			CreateArray.createArray();	
			menuChoice();
			}

			public static void menuChoice()
			{
				java.util.Scanner userInput = new Scanner(System.in);
				System.out.println("What would you like to do?");
				System.out.println("   1) Add or delete a student");
				System.out.println("   2) Change student grades/schedule");
				System.out.println("   3) Sort students");
				
				int selection = userInput.nextInt();
				if (selection == 1)
					{
					changeRoster();
					}
				else if (selection == 2)
					{
					changeGrades();
					}
				else 
					{
					sortStudents();
					}
			}
			

			

			private static void changeRoster()
				{
				System.out.println("Would you like to add or delete a student?");
				System.out.println("   1) Add");
				System.out.println("   2) Delete");
				
				}
			
			private static void changeGrades()
				{
				// TODO Auto-generated method stub
				
				}
				
			private static void sortStudents()
				{
				java.util.Scanner userInput = new Scanner(System.in);
				System.out.println("How would you like to sort students?");
				System.out.println("   1) Last Name");
				System.out.println("   2) GPA");
				System.out.println("   3) Class Period");
				int sortSelection = userInput.nextInt();
				}

	}
