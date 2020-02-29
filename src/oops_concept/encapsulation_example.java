package oops_concept;

public class encapsulation_example {
	private int year;
	private String name;
			
	void setYear(int input)
	{
		year=input;
	}
	void setName(String nm)
	{
		name=nm;
	}
  void display()
  {
	  System.out.println(year);
	  System.out.println(name);
  }
}
