package eraa_soft.oop.question_2;

public class Player
{
	private int number;
	private String name;

	public void setNumber(int number)
	{
		if (number > 0)
			this.number = number;
		else
			System.out.println("Invalid Number");
	}

	public void setName(String name)
	{
		if (name.length() > 5)
			this.name = name;
		else
			System.out.println("Invalid Name");
	}

	@Override
	public String toString()
	{
		return STR."Player{number=\{number}, name='\{name}\{'\''}\{'}'}";
	}
}
