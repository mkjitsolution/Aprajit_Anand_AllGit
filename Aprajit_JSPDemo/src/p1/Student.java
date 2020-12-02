package p1;

public class Student {
	private String name;
	private String course;
	private String category;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String course, String category) {
		super();
		this.name = name;
		this.course = course;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", category=" + category + "]";
	}
	
	

}
