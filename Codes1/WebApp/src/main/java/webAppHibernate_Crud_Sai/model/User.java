package webAppHibernate_Crud_Sai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	
@Column
private String name;
@Column
private String city;
@Id
@Column
private String Email;


public User(String name, String city, String email) {
	super();
	this.name = name;
	this.city = city;
	Email = email;
}
public User() {
}
	
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}


}
