package kr.miraesoft.miraebook.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Translator {

	@Column(nullable = false)
	private Integer id;


	@Column(nullable = true)
	private String name;
	
	public Translator() {
		// TODO Auto-generated constructor stub
	}
	public Translator(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	
	
	
	
	
}
