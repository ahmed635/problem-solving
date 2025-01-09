package eraa_soft.oop.question_4;

public class Student extends BaseEntity
{
	private int age;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public boolean isValidData()
	{
		return super.isValidData() && age > 7 && age < 30;
	}

	@Override
	public String toString()
	{
		return String.format("Student: {%15s, age: %2d}", super.toString(), age);
	}
}
