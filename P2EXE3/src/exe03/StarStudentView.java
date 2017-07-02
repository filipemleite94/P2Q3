package exe03;

public class StarStudentView extends GenericView {
	public void printStudentDetails(String studentName, String studentRollNo) {
		System.out.println("Student: ");
		System.out.println("Name: " + studentName + "*");
		System.out.println("Roll No: " + studentRollNo);
	}
}
