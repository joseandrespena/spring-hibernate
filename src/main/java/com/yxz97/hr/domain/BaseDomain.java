/******************************************************************
  			BaseDomain.java
			- Attribution-Noncommercial-Share Alike 3.0 Unported

You are free, to Share  — to copy, distribute and transmit the work, 
to Remix — to adapt the work refer to 
http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_US more details

********************************************************************/

package com.yxz97.hr.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public class BaseDomain implements Serializable {
	
	@Transient
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public BaseDomain() {

	}

	public BaseDomain(Long id) {
		this.id = id;
	}

	public boolean isNew() {
		return (id == null);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}
