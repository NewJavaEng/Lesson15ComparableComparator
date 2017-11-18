package by.http.stud.bean;

public class Group {

	private Student[] students;
	private int studentsCount;

	public Group(int size) {
		students = new Student[size];

	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int getStudentsCount() {
		return studentsCount;
	}

	public void setStudentsCount(int studentsCount) {
		this.studentsCount = studentsCount;
	}

	public void addStudent(Student student) {
		if (studentsCount < students.length) {
			students[studentsCount] = student;
			studentsCount++;
		} else {
			System.out.println("Group is full!");
		}

	}

	// Comparable
	public Group sortStudentsByAge() {
		int q = 0;
		for (int i = students.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (q < students[j].compareTo(students[j + 1])) {
					Student buff = students[j];
					students[j] = students[j + 1];
					students[j + 1] = buff;
				}
			}
		}
		return null;
	}

	// Comparator
	public Group sortStudentsByAgeWithTeacher() {
		StudentCompare stcomp = new StudentCompare();

		int q = 0;
		for (int i = students.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (q < stcomp.compare(students[j], students[j + 1])) {
					Student buff = students[j];
					students[j] = students[j + 1];
					students[j + 1] = buff;
				}
			}
		}
		return null;
	}

	// Comparator
	public Group sortStudentsByNameAge() {
		StudentCompareNameAge stcomp = new StudentCompareNameAge();

		int q = 0;
		for (int i = students.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (q < stcomp.compare(students[j], students[j + 1])) {
					Student buff = students[j];
					students[j] = students[j + 1];
					students[j + 1] = buff;
				}
			}
		}
		return null;
	}

}
