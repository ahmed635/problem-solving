package eraa_soft.oop.question_2;

import java.util.Scanner;

public class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Player player = new Player();

		System.out.println("Enter Student Number: ");
		player.setNumber(sc.nextInt());

		System.out.println("Enter Student name: ");
		player.setName(sc.next());

		System.out.println(player);
	}
}
