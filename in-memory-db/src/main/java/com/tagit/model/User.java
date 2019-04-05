package com.tagit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * 
 * @author shwetank.shukla
 *
 */

@Entity
@Data
public class User implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String name;
	private int age;
	
	public User() {
		super();
	}

	public User(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}
