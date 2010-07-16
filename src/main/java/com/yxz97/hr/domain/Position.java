package com.yxz97.hr.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Position {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;

}
