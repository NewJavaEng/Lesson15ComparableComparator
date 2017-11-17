package by.http.stud.bean;

public class Student implements Comparable<Student> {

	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student anotherStudent) {
		int anotherStudentAge = anotherStudent.getAge();
		return this.age - anotherStudentAge;
	}

}
