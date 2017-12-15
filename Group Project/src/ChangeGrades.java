import java.io.IOException;
import java.util.Scanner;
public class ChangeGrades
	{

		public static void changeGrades()
			{
				java.util.Scanner userInput = new Scanner(System.in);
				System.out.println("What student would you like to change?");
				for(int i = 0; i<MainMenu.students.size(); i++)
					{
				System.out.println((i+1) + "    "+  MainMenu.students.get(i).getFirstName() + " " + MainMenu.students.get(i).getLastName());
					}
				int selection = userInput.nextInt();
				System.out.println("Would you like to change " + MainMenu.students.get(selection-1).getFirstName() + "'s grades or schedule? Press 1 for grades and 2 for schedule");
				int gradeOrSchedule = userInput.nextInt();
				if(gradeOrSchedule == 1)
				{
					
					System.out.println("\n Here are " + MainMenu.students.get(selection-1).getFirstName()+ "'s current grades");
					
					System.out.println("   " + MainMenu.students.get(selection-1).getClassGrade1() + " " + MainMenu.students.get(selection-1).getFirstClass());
					System.out.println("   " + MainMenu.students.get(selection-1).getClassGrade2() + " " + MainMenu.students.get(selection-1).getSecondClass());
					System.out.println("   " + MainMenu.students.get(selection-1).getClassGrade3() + " " + MainMenu.students.get(selection-1).getThirdClass());
					System.out.println();
					System.out.println("Which class's grade would you like to change?");
					
					int gradeSelection = userInput.nextInt();
					if (gradeSelection == 1)
					{
					java.util.Scanner userInput2 = new Scanner(System.in);
					
					System.out.println("What would you like to change their " +  MainMenu.students.get(selection-1).getFirstClass() + " grade to?");
					String grade = userInput.nextLine();
					System.out.println();
					System.out.println("Their "+ MainMenu.students.get(selection-1).getSecondClass() + " grade has been changed to a " + grade);
					MainMenu.students.get(selection-1).setClassGrade1(grade);
					}
					
					
					if (gradeSelection == 2)
					{
					java.util.Scanner userInput2 = new Scanner(System.in);
					
					System.out.println("What would you like to change their " +  MainMenu.students.get(selection-1).getSecondClass() + " grade to?");
					String grade = userInput.nextLine();
					System.out.println("Their "+ MainMenu.students.get(selection-1).getSecondClass() + " grade has been changed to a " + grade);
					MainMenu.students.get(selection-1).setClassGrade2(grade);
					}
					
					
					if (gradeSelection == 3)
					{
					java.util.Scanner userInput2 = new Scanner(System.in);
					System.out.println("What would you like to change their " +  MainMenu.students.get(selection-1).getThirdClass() + " grade to?");
					String grade = userInput.nextLine();
					System.out.println("Their "+ MainMenu.students.get(selection-1).getThirdClass() + " grade has been changed to a " + grade);
					MainMenu.students.get(selection-1).setClassGrade3(grade);
					}
		
				}
			
			}
	}
