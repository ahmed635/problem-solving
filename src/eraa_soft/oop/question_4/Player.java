package eraa_soft.oop.question_4;

public class Player extends BaseEntity
{
	private int number;

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	@Override
	public boolean isValidData()
	{
		return super.isValidData() && number > 0 && number < 100;
	}

	@Override
	public String toString()
	{
		return String.format("Player: {%15s, number: %2d}", super.toString(), number);
	}
}
