package kr.miraesoft.miraebook.domain;

import javax.persistence.*;


@Entity 
@Table(name = "AUTHOR")
public class Author {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
 	private Integer no;
 	
	private String name;
	
	private String email;
	
	private String homepage;
	
	
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

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	
}
