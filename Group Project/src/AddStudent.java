import java.text.DecimalFormat;
import java.util.*;

public class AddStudent
	{
		static double GPA;
		static double gradeValueOne;
		static double gradeValueTwo;
		static double gradeValueThree;
		public static void changeStudent(ArrayList<Student> students)
			{
				java.util.Scanner userInput = new Scanner(System.in);
				int select = userInput.nextInt();
				if (select == 1)
					{
						java.util.Scanner userInput1 = new Scanner(System.in);
						System.out.println("What's their name? Also what are their 3 classes and grades? ");
						String info = userInput1.nextLine();
						String [] infos = info.split(" ");
						Collections.sort(students, new GPASorter());
						MainMenu.calculateGPAOne();
						MainMenu.calculateGPATwo();
						MainMenu.calculateGPAThree();
						DecimalFormat df = new DecimalFormat("0.00");
						GPA = (gradeValueOne + gradeValueTwo + gradeValueThree) / 3;
						students.add(new Student (infos[0], infos[1], infos[2], infos[3], infos[4], infos[5], infos[6], infos[7], df.format(GPA)));
					}
				else if (select == 2)
					{
						java.util.Scanner userInput2 = new Scanner(System.in);
						System.out.println("Who do you want to leave the island?");
						System.out.println();
						for (int i = 0; i < students.size(); i++)
						{
						System.out.println(students.get(i).getFirstName() + " " + students.get(i).getLastName());
						}
						
						String name = userInput2.nextLine();
						int getOut = 0;
						for (int i = 0; i < students.size(); i++)
							{
								String firstlast = students.get(i).getFirstName() + students.get(i).getLastName();
								if (name.equals(firstlast))
									{
										getOut = i;
									}
							}
						students.remove(getOut);
						System.out.println("They're OUTA here!");
					}
			}
	}
