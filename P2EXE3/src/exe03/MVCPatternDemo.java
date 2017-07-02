package exe03;

public class MVCPatternDemo {
	public static void main(String[] args) {
		ControllerFactory controller;
		controller = ControllerFactory.getController(retriveStudentFromDatabase());

		controller.updateView();

		// update model data
		controller.setStudentName("John");

		controller.updateView();
		
		controller = ControllerFactory.getController(retriveStarStudentFromDB());
		
		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	
	private static StarStudent retriveStarStudentFromDB(){
		StarStudent student = new StarStudent();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

}
