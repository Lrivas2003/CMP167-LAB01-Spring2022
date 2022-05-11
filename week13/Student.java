
public class Student extends Person {
	static int studentTotal;
	private int id;
	private int gradeLevel;
	private int courseTotal;
	private String [] currentCourses;
	public Student() {
		
	}
	
	public boolean dropACourse(String courseName) {
		if(courseTotal>0) {
			int index = -1;
			for(int i = 0; i<courseTotal; i++) {
				if (currentCourses[i].equalsIgnoreCase(courseName)) {
					index=i;
				}
			}
			if(index >-1) {
				
				for (int i = index; i < courseTotal; i++) {
					currentCourses[i] = currentCourses[i+1];
				}
				currentCourses[courseTotal-1] = null;
				courseTotal--;
				return true;
				
			}
		}
		
		return false;
	}
}

