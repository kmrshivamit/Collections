package List;

import java.util.LinkedList;
import java.util.List;

public class UisngLinkedList {

	public static void main(String[] args) {
		List<Student> students = new LinkedList<>();

		students.add(new Student(1, "Shubham", 22));
		students.add(new Student(2, "Shreya", 21));
		students.add(new Student(3, "Rahul", 23));
		students.forEach(s -> System.out.println(s));

		System.out.println("Using get by index with index 0 " + students.get(0));

		System.out.println("the size of linkedlist before deletion " + students.size());
		students.remove(2);
		System.out.println("The size of linkedlist after deletion" + students.size());
	}

}
