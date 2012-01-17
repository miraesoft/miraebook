package kr.miraesoft.miraebook.domain;

import javax.persistence.*;


@Entity 
@Table(name = "AUTHOR")
public class Author {
	
	@Id @GeneratedValue
	@Column(name = "NO")
 	private int no;
 	
	@Column(name = "NAME")
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNo(int no) {
		// TODO Auto-generated method stub
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	
	
}
