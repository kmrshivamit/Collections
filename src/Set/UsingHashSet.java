package Set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;



public class UsingHashSet {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();

		Student s1=new Student(1, "Shubham", 22);
		Student s2 =new Student(2, "Shreya", 21);
		Student s3=new Student(3, "Rahul", 23);
	
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s1);
		students.add(s2);
		
		
		students.forEach(s -> System.out.println(s));

		System.out.println("the size of set before deletion " + students.size());
		students.remove(s1);
		System.out.println("The size of set after deletion" + students.size());
	}

}
