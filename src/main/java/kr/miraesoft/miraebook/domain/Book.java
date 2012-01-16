package kr.miraesoft.miraebook.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	private Long id;

	@Id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
