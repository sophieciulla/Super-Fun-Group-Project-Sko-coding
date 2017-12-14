import java.util.Comparator;

public class GPASorter implements Comparator<Student>
{
	public int compare (Student g1, Student g2)
	{
	return g2.getGPA().compareTo(g1.getGPA());
	}
}