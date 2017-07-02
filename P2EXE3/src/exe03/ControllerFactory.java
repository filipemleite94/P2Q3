package exe03;

import java.lang.reflect.InvocationTargetException;

public abstract class ControllerFactory {
	protected GenericModel model;
	protected GenericView view;
	
	public static ControllerFactory getController(GenericModel model){
		ControllerFactory controller = null;
		String modelName = model.getClass().getName();
		GenericView view;
		try {
			view = (GenericView) Class.forName(modelName+"View").newInstance();
			controller = (ControllerFactory) Class.forName(modelName + "Controller").getConstructor(model.getClass(), view.getClass()).newInstance(model, view);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return controller;
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}

}
