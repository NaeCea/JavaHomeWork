package onlineCourse.entities;

public class Courses {
private int id;
private String name;
private double price;
private int idCategory;
private int idEditor;
public Courses() {
	super();
	// TODO Auto-generated constructor stub
}
public Courses(int id, String name, double price, int idCategory, int idEditor) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.idCategory = idCategory;
	this.idEditor = idEditor;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getIdCategory() {
	return idCategory;
}
public void setIdCategory(int idCategory) {
	this.idCategory = idCategory;
}
public int getIdEditor() {
	return idEditor;
}
public void setIdEditor(int idEditor) {
	this.idEditor = idEditor;
}





}
