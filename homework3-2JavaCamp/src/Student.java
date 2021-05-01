
public class Student extends User{
	private String contactEmail;
	private int courseNumber;
	private String courseName;
	
	public Student() {
		
	}

	public Student(String contactEmail, int courseNumber, String courseName) {
		super();
		this.contactEmail = contactEmail;
		this.courseNumber = courseNumber;
		this.courseName = courseName;
	}
	
	
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
