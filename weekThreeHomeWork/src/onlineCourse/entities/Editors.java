package onlineCourse.entities;

public class Editors {
   private int id;
   private String nameSurname;
public Editors() {
	super();
	// TODO Auto-generated constructor stub
}
public Editors(int id, String nameSurname) {
	super();
	this.id = id;
	this.nameSurname = nameSurname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNameSurname() {
	return nameSurname;
}
public void setNameSurname(String nameSurname) {
	this.nameSurname = nameSurname;
}

}
