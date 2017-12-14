import java.util.Comparator;

public class ThirdPeriodSorter implements Comparator<Student>
{
	public int compare (Student s1, Student s2)
	{
	return s1.getThirdClass().compareTo(s2.getThirdClass());
	}
}