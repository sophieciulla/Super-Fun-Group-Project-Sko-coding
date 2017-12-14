import java.util.Comparator;

public class LastNameComparator implements Comparator<Group>
{
	public int compare (Group s1, Group s2)
	{
	return s1.getLastName().compareTo(s2.getLastName());
	}
}