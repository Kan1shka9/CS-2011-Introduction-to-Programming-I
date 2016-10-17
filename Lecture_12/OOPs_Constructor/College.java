package CS2011.Lecture12.OOPs_Constructor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class College {
	private List<Department> departments = new ArrayList<Department>();
	
	public void administer() {
		String[] choices = { "Quit", "List Courses For A Department", "Add A Course", "Add A Department" };
		int choice;
		do {
			// choice = JOptionPane.showOptionDialog(null, "Main Menu", "Main Menu", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices, "None of your business");  
			choice = JOptionPane.showOptionDialog(null, "Main Menu", "Main Menu", 0, JOptionPane.QUESTION_MESSAGE, null, choices, "null");
			switch (choice) {
			case 0:
				break;
			case 1:
				if (!(departments.isEmpty()))
					listDeptClasses();
				break;
			case 2:
				if (!(departments.isEmpty()))
					addCourse();	
				break;
			case 3:
				addDept();
				break;
			} // end switch

		} while (choice != 0); // end do
	}// end main
	
	private Department getDeptNameFromInput() {
		int choice = JOptionPane.showOptionDialog(null, "Choose A Department", "Choose A Department", 0, JOptionPane.QUESTION_MESSAGE, null, departments.toArray(), "null"); // the choices must be an array
		return departments.get(choice);
	}

	private void listDeptClasses() {
		Department dept = getDeptNameFromInput();
		if (departments.contains(dept)) {
			List<Course> deptCourses = dept.getCourses();
			StringBuilder sb = new StringBuilder(dept.getDeptName() + " offers the following courses:\n ");
			if (deptCourses.isEmpty())
				sb.append("None");
			else
				for (Course c : deptCourses)
					sb.append(c + "\n"); // note that this will use the toString() method of Course
			JOptionPane.showMessageDialog(null, sb);
		} // end if
	}

	private void addCourse() {
		Department dept = getDeptNameFromInput();
		if (departments.contains(dept)) {
			int courseNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter the course number"));
			String instructorName = JOptionPane.showInputDialog("Please enter the name of the instructor in the new course");
			dept.addCourse(new Course(courseNum, instructorName));
		}// end if
	}

	private void addDept() {
		String deptName = JOptionPane.showInputDialog("Please enter the name of the new department");
		departments.add(new Department(deptName));
	}
	
}