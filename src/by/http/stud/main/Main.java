package by.http.stud.main;

import by.http.stud.bean.Group;
import by.http.stud.bean.Student;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Jack", 18);
		Student student2 = new Student("Phill", 20);
		Student student3 = new Student("Milla", 18);
		Student student4 = new Student("Milla", 19);
		Student student5 = new Student("Rutta", 17);

		Group group = new Group(5);

		group.addStudent(student1);
		group.addStudent(student2);
		group.addStudent(student3);
		group.addStudent(student4);
		group.addStudent(student5);

		group.sortStudentsByAge();

		for (Student st : group.getStudents()) {
			System.out.println("Student age " + st.getAge());

		}

		System.out.println("");

		group.sortStudentsByAgeWithTeacher();

		for (Student studik : group.getStudents()) {
			System.out.println("Student sorted by age (with teacher) " + studik.getName() + " " + studik.getAge());
		}

		System.out.println("");

		group.sortStudentsByNameAge();

		for (Student studichek : group.getStudents()) {
			System.out.println("Student sorted by name and age " + studichek.getName() + " " + studichek.getAge());
		}

	}

}
