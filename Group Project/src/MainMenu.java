
import java.io.*;
import java.util.*;
import java.text.*;
;public class MainMenu
	{
		static ArrayList<Group> students = new ArrayList<Group>();
		static String[] array;
		static double GPA;
		static double gradeValueOne;
		static double gradeValueTwo;
		static double gradeValueThree;
		public static void main(String[] args) throws IOException
			{
			System.out.println("Hello");
			createArray();	
			menuChoice();
			}

		private static void sortStudents()
			{
			System.out.println("How would you like to sort students?");
			System.out.println("   1) Last Name");
			System.out.println("   2) GPA");
			System.out.println("   3) Class Period");
			}

		private static void createArray() throws IOException
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
				students.add(new Group (array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], df.format(GPA)));
				}	
			}	
		
			private static void calculateGPAThree()
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

			private static void calculateGPATwo()
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

			private static void calculateGPAOne()
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

			public static void menuChoice()
			{
				System.out.println("What would you like to do?");
				System.out.println("   1) Add or delete a student");
				System.out.println("   2) Change student grades/schedule");
				System.out.println("   3) Sort students");
				java.util.Scanner userInput = new Scanner(System.in);
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

			private static void changeGrades()
				{
				// TODO Auto-generated method stub
				
				}

			private static void changeRoster()
				{
				// TODO Auto-generated method stub
				
				}

	}
