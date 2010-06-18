/******************************************************************
  			Person.java
			- Attribution-Noncommercial-Share Alike 3.0 Unported

You are free, to Share  — to copy, distribute and transmit the work, 
to Remix — to adapt the work refer to 
http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_US more details

 ********************************************************************/

package com.yxz97.hr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
@NamedQueries( {
		@NamedQuery(name = "getPersonByName", query = "from Person m where m.firstName LIKE :name"),
		@NamedQuery(name = "listPersonByName", query = "from Person m order by m.lastName, firstName") })
public class Person extends BaseDomain {

	private static final long serialVersionUID = 1L;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;

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
