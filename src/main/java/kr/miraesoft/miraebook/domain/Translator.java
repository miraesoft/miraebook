package kr.miraesoft.miraebook.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Translator {

	@Id 
	@Column(name="NO")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer no;

	@Column(nullable = true)
	private String name;

	@Column(nullable = true)
	private String email;
	
	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
