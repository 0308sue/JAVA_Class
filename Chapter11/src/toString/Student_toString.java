package toString;

class Student{
	int student_id;
	String name;
	
	Student(int student_id,String name){
		this.student_id = student_id;
		this.name = name;
	}

	@Override
	public String toString() {
		return student_id+","+name;
	}
	
}
public class Student_toString {

	public static void main(String[] args) {
		Student stu = new Student(112233,"한소희");
		
		System.out.println(stu);
		System.out.println(stu.toString());

	}

}
