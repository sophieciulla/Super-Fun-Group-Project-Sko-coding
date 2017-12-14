import java.util.Comparator;

public class SecondPeriodSorter implements Comparator<Student>
{
	public int compare (Student s1, Student s2)
	{
	return s1.getSecondClass().compareTo(s2.getSecondClass());
	}
}