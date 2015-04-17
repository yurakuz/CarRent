package home.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "history_table")
public class History {
	
	@Column
	private User user;
	@Column
	private Car car;
	
	
	public History(){
			}


	public History(User user, Car car) {
		super();
		this.user = user;
		this.car = car;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	@Override
	public String toString() {
		return "History [user=" + user + ", car=" + car + "]";
	}

	
}
