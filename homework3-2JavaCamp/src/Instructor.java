
public class Instructor extends User {
	private String instructorDescription;
	private String instructedCourseName;
	
	public Instructor() {
		
	}
	
	public Instructor(String instructorDescription, String instructedCourseName) {
		super();
		this.instructorDescription = instructorDescription;
		this.instructedCourseName = instructedCourseName;
	}
	
	
	public String getInstructorDescription() {
		return instructorDescription;
	}
	public void setInstructorDescription(String instructorDescription) {
		this.instructorDescription = instructorDescription;
	}
	public String getInstructedCourseName() {
		return instructedCourseName;
	}
	public void setInstructedCourseName(String instructedCourseName) {
		this.instructedCourseName = instructedCourseName;
	}
}
