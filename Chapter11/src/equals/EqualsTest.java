package equals;

class Student{
	int StudentId;
	String StudentName;
	
	public Student(int StudentId,String StudentName) {
		this.StudentId = StudentId;
		this.StudentName = StudentName;
	}

	@Override
	public String toString() {
		return StudentId+","+StudentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student)obj;
			if(this.StudentId == StudentId)
				return true;
			else return false;
		}else return false;
	}
	
}
public class EqualsTest {

	public static void main(String[] args) {
		Student StudentLee = new Student(123,"이도현");
		Student StudentLee2 = StudentLee;
		Student StudentHyun = new Student(123,"이도현");
		
		if(StudentLee == StudentLee2) {
			System.out.println("StudentLee와 StudentLee2의 주소는 같습니다.");
		}else {
			System.out.println("StudentLee와 StudentLee2의 주소는 다릅니다.");
		}
		
		if(StudentLee.equals(StudentLee2)) {
			System.out.println("StudentLee와 StudentLee2는 동일합니다.");
		}else {
			System.out.println("StudentLee와 StudentLee2는 동일하지 않습니다.");
		}

	}

}
