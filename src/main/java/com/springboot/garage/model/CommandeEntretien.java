package com.springboot.garage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CommandeEntretien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
}
