package Map;

import java.util.Map;
import java.util.TreeMap;

public class UinsgTreeMap {
	public static void main(String[] args) {
		Map<Integer, Student> students = new TreeMap<>();
		Student s1 = new Student(1, "Shubham", 22);
		Student s2 = new Student(2, "Shreya", 21);
		Student s3 = new Student(3, "Rahul", 23);
		students.put(22, s1);
		students.put(21, s2);
		students.put(23, s3);
		students.forEach((k, v) -> System.out.println("key value is " + k + " Value is " + v));
		System.out.println("size of map before deletion" + students.size());
		students.remove(22);
		System.out.println("size of map after deletion" + students.size());

	}

}
