package eraa_soft.oop.question_1;

public class Student
{
	private int id;
	private String name;
	private int age;


	public void setId(int id)
	{
		if(id >0)
			this.id = id;
		else
			System.out.println("Invalid Id");
	}


	public void setName(String name)
	{
		if(name.length() >5)
			this.name = name;
		else
			System.out.println("Invalid Name");
	}


	public void setAge(int age)
	{
		if(age > 10)
			this.age = age;
		else
			System.out.println("Invalid Age");
	}

	@Override
	public String toString()
	{
		return STR."Student{id=\{id}, name='\{name}\{'\''}, age=\{age}\{'}'}";
	}
}
