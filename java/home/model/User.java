package home.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "user_table")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Integer id;
	@Column
    private String FullName;
    @Column
    private String Password;
    
	public User() {
}

	public User(String fullName, String password) {
		super();
		FullName = fullName;
		Password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", FullName=" + FullName + ", Password="
				+ Password + "]";
	}


	

}
