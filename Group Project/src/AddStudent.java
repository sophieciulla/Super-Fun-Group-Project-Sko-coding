import java.util.*;

public class AddStudent
	{

		public static void changeStudent(ArrayList<Group> students)
			{
				java.util.Scanner userInput = new Scanner(System.in);
				int select = userInput.nextInt();
				if (select == 1)
					{
						System.out.println("What's their name? Also what are their 3 classes and grades?");
						String info = userInput.nextLine();
						String [] infos = info.split(" ");
						students.add(new Group(infos[0], infos[1], infos[2], infos[3], infos[4], infos[5], infos[6], infos[7], " "));
					}
				else if (select == 2)
					{
						System.out.println("Who do you want to leave the island?");
						String name = userInput.nextLine();
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
					}
			}

	}
