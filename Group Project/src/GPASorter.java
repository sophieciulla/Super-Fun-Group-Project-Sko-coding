import java.util.Comparator;

public class GPASorter implements Comparator<Student>
{
	public int compare (Student g1, Student g2)
	{
	return g1.getGPA().compareTo(g2.getGPA());
	}
}