package eraa_soft.oop.question_4;

public class BaseEntity
{
	private int id;
	private String name;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean isValidData()
	{
		return id > 0 && name.length() > 5;
	}

	@Override
	public String toString()
	{
		return String.format("Id: %d, Name: %10s", id, name);
	}
}
