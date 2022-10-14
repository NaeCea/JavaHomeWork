package onlineCourse.entities.CustomModels;

import onlineCourse.entities.Categories;
import onlineCourse.entities.Courses;
import onlineCourse.entities.Editors;

public class CourseInformationModel {
	
	private Categories category;
	private Courses course;
	private Editors editor;
	
	
	
	public CourseInformationModel(Categories category, Courses course, Editors editor) {
		
		this.category = category;
		this.course = course;
		this.editor = editor;
	}
	public Categories getCategory() {
		return category;
	}
	public void setCategory(Categories category) {
		this.category = category;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	public Editors getEditor() {
		return editor;
	}
	public void setEditor(Editors editor) {
		this.editor = editor;
	}
	

}
