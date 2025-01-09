package eraa_soft.oop.question_4;

import java.util.Scanner;

public class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Player player = new Player();

		System.out.println("Enter Player Id: ");
		player.setId(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter Player name: ");
		player.setName(sc.nextLine());

		System.out.println("Enter Player number: ");
		player.setNumber(sc.nextInt());

		if (player.isValidData())
			System.out.println(player);
		else
			System.out.println("Invalid Player Data");
	}
}
