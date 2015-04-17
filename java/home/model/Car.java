package home.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_table")
public class Car {

@Id
@GeneratedValue
@Column(name = "car_id")
private int id;
@Column
private String brand;
@Column
private String model;
@Column
private String classCar;
@Column
private String color;
@Column
private String trasmision;
@Column
private int price;
@Column
private int status; // стан авто 

private User user;

public Car() {
}

public Car(String brand, String model, String classCar, String color,
		String trasmision, int price, int status, User user) {
	super();
	this.brand = brand;
	this.model = model;
	this.classCar = classCar;
	this.color = color;
	this.trasmision = trasmision;
	this.price = price;
	this.status = status;
	this.user = user;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getClassCar() {
	return classCar;
}

public void setClassCar(String classCar) {
	this.classCar = classCar;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getTrasmision() {
	return trasmision;
}

public void setTrasmision(String trasmision) {
	this.trasmision = trasmision;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getStatus() {
	return status;
}

public void setStatus(int status) {
	this.status = status;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

@Override
public String toString() {
	return "Car [id=" + id + ", brand=" + brand + ", model=" + model
			+ ", classCar=" + classCar + ", color=" + color + ", trasmision="
			+ trasmision + ", price=" + price + ", status=" + status
			+ ", user=" + user + "]";
}
	
	
	
}
