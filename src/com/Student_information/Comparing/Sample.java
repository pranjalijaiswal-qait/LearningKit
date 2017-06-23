package com.Student_information.Comparing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Sample {
	static int n;
	static ArrayList<Student> al = new ArrayList<Student>();
	static int id;
	static String name;
	static double cg;
/**
 * for taking the input information of student from the user
 */
	public static void takeInput() 
	{
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			id = scanner.nextInt();
			name = scanner.next();
			cg = scanner.nextDouble();
			al.add(new Student(id, name, cg));
		}

	}

	public static void main(String[] args) 
	{
		takeInput();
		Collections.sort(al, new DataComparator());
		Iterator<Student> iter = al.iterator();
		/**
		 * printing the list after sorting
		 */
		while (iter.hasNext()) 
		{
			Student st = iter.next();
			System.out.println(st.FirstName);

		}
	}
}
