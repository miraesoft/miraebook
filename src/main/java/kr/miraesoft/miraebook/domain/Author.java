package kr.miraesoft.miraebook.domain;

import javax.persistence.*;


@Entity 
@Table(name = "AUTHOR")
public class Author {
	
	@Id 
	@Column(name = "NO")
	@GeneratedValue(strategy=GenerationType.AUTO)
 	private Integer no;
 	
	@Column(name = "NAME")
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	
	
}
