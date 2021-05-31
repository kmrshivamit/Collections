package List;

import java.util.ArrayList;

public class UsingArrayList {
	
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(1,"Shubham",22));
		students.add(new Student(2,"Shreya",21));
		students.add(new Student(3,"Rahul",23));
		
		for(Student student:students)
			System.out.println(student);
		
	//students.forEach(s->System.out.println(s));
	
	 System.out.println("Using get by index with index 0 " + students.get(0));
	 
	System.out.println("the size of arraylist before deletion "+ students.size());
	students.remove(2);
	System.out.println("The size of araylist after deletion"+students.size());
	 
		
		
	}

}
