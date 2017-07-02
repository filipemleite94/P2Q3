package exe03;

public class StudentController extends ControllerFactory{
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
}
