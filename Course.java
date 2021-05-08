
public class Course {
    private int id;
	private String educationName;
	private String instructorName;
	
	
	public Course() {
		
	}
	
	public Course(int id, String educationName, String instructorName)  {
		
		this.id = id;
		this.educationName = educationName;
		this.instructorName = instructorName;
	}
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEducationName() {
		return educationName;
	}

	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	 
	
	

}
