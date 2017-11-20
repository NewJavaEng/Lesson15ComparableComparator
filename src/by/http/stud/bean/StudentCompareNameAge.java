package by.http.stud.bean;

import java.util.Comparator;

public class StudentCompareNameAge implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {

		String st11 = stu1.getName();
		String st22 = stu2.getName();
		if (st11.compareTo(st22) > 0) {
			return 1;
		} else if (st11.compareTo(st22) == 0) {

			return stu1.getAge() - stu2.getAge();
		} else {
			return 0;
		}

	}

}
