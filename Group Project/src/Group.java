
public class Group 
	{
	private String firstName;
	private String lastName;
	private String firstClass;
	private String classGrade1;
	private String secondClass;
	private String classGrade2;
	private String thirdClass;
	private String classGrade3;    
	
	public Group (String fn, String ln, String fc, String cg1, String sc, String cg2, String tc, String cg3)
		{
		firstName = fn;
		lastName = ln;
		firstClass = fc;
		classGrade1 = cg1;
		secondClass = sc; 
		classGrade2 = cg2;
		thirdClass = tc;
		classGrade3 = cg3;
		}

	public String getFirstName()
		{
		return firstName;
		}

	public void setFirstName(String firstName)
		{
		this.firstName = firstName;
		}

	public String getLastName()
		{
		return lastName;
		}

	public void setLastName(String lastName)
		{
		this.lastName = lastName;
		}

	public String getFirstClass()
		{
		return firstClass;
		}

	public void setFirstClass(String firstClass)
		{
		this.firstClass = firstClass;
		}

	public String getClassGrade1()
		{
		return classGrade1;
		}

	public void setClassGrade1(String classGrade1)
		{
		this.classGrade1 = classGrade1;
		}

	public String getSecondClass()
		{
		return secondClass;
		}

	public void setSecondClass(String secondClass)
		{
		this.secondClass = secondClass;
		}

	public String getClassGrade2()
		{
		return classGrade2;
		}

	public void setClassGrade2(String classGrade2)
		{
		this.classGrade2 = classGrade2;
		}

	public String getThirdClass()
		{
		return thirdClass;
		}

	public void setThirdClass(String thirdClass)
		{
		this.thirdClass = thirdClass;
		}

	public String getClassGrade3()
		{
		return classGrade3;
		}

	public void setClassGrade3(String classGrade3)
		{
		this.classGrade3 = classGrade3;
		}
	}
