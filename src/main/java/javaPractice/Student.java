package javaPractice;

public class Student {
	String student_name = "UNKNOWN";
	
	Student() {
		
	}
	
	Student(String name) {
		student_name = name;
		
	}
	public static void main(String[] args) {
		// create an object
		Student s1 = new Student();
		System.out.println("Name of the student:" + s1.student_name);
		
		Student s2 = new Student("Srini");
		System.out.println("Name of the student:" + s2.student_name);
		

	}

}
