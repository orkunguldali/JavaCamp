
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setName("Orkun");
		student1.setCourseName("Java");
		student1.setCourseNumber(1);
		
		Student student2 = new Student();
		student2.setName("Oğuzhan");
		student2.setCourseName("C#");
		student2.setCourseNumber(2);
		
		Instructor instructor1 = new Instructor();
		instructor1.setName("Engin");
		instructor1.setInstructorDescription("Kral Hoca");
		
		User[] users = {student1,student2,instructor1};
		
		for(User user : users) {
			System.out.println(user.getName());  
			}
		
		UserManager userManager = new UserManager();
		
		userManager.logIn(student1);
		userManager.logOut(student1);

		
		StudentManager studentManager = new StudentManager();
		
		studentManager.logIn(student2);
		studentManager.registerCourse("Java Kursu");
		studentManager.logOut(student2);

		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.logIn(instructor1);
		instructorManager.assignHomework();
		instructorManager.logOut(instructor1);

		
	}

}
