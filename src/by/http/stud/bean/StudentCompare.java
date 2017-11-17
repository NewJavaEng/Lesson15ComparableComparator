package by.http.stud.bean;

import java.util.Comparator;

public class StudentCompare implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {

		int age1 = st1.getAge();
		int age2 = st2.getAge();

		if (age1 > age2) {
			return -1;
		} else if (age1 == age2) {
			return 0;
		} else {
			return 1;
		}
	}

}
