package eraa_soft.oop.question_1;

import java.util.Scanner;

public class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		System.out.println("Enter Student Id: ");
		student.setId(sc.nextInt());

		System.out.println("Enter Student name: ");
		student.setName(sc.next());

		System.out.println("Enter Student age: ");
		student.setAge(sc.nextInt());

		System.out.println(student);
	}
}
