package com.Student_information.Comparing;

import java.util.Comparator;

public class DataComparator implements Comparator<Object> {
	/**
	 * Override compare to sort in decreasing order of CGPA;
	 * if CGPA is equal,then sort in alphabetical order of their FirstName;
	 * if their names are too same,then sort as per their id's which are always unique
	 */
	public int compare(Object o1, Object o2)
	{
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		if (s1.CGPA == s2.CGPA) 
		{
			if (s1.FirstName.equalsIgnoreCase(s2.FirstName)) 
			{
				if (s1.id > s2.id)
					return 1;
				else
					return 0;
			} else
				return s1.FirstName.compareTo(s2.FirstName);
		}
		else if (s1.CGPA > s2.CGPA)
			return -1;
		else
			return 0;
	}

}