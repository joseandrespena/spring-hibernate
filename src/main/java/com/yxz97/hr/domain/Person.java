/******************************************************************
  			Person.java
			- Attribution-Noncommercial-Share Alike 3.0 Unported

You are free, to Share  — to copy, distribute and transmit the work, 
to Remix — to adapt the work refer to 
http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_US more details

test for hookservices

 ********************************************************************/

package com.yxz97.hr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "Person")
@NamedQueries({
		@NamedQuery(name = "getPersonByName", query = "from Person m where m.firstName LIKE :name"),
		@NamedQuery(name = "listPersonByName", query = "from Person m order by m.lastName, firstName") })
public class Person extends BaseDomain {

	private static final long serialVersionUID = 1L;

	@Column(name = "firstName")
	String firstName;

	@Column(name = "lastName")
	String lastName;

	@Column(name = "email")
	String email;

	@Column(name = "address")
	String address;

	@Column(name = "phone")
	String phone;

	@Column(length = 1, nullable = false)
	Short gender;

	String birthDate;

	@JoinColumn(columnDefinition = "position_id", name = "position_id")
	@Type(type = "com.yxz97.hr.domain.Person")
	Position position;

	String office;

	String mobile;

	String username;

	String password;

	String keywords;

	String photo;

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Short getGender() {
		return gender;
	}

	public void setGender(Short gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		else if (obj == null)
			return false;
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return (this.getId() == p.getId());
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return (this.getId()).hashCode();
	}

	@Override
	public String toString() {
		return "id:" + this.getId() + "firstName:" + this.getFirstName()
				+ "lastName:" + this.getLastName();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
