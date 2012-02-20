package kr.miraesoft.miraebook.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookno;

	@Column
	private String name;
	
	@Column
	private Long cost;
	
	@OneToOne(fetch=FetchType.EAGER)
	private Location location;
	
	@OneToOne(fetch=FetchType.EAGER)
	private Publisher publisher;	
	
	@OneToOne(fetch=FetchType.EAGER)
	private Translator translator;

/*
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	private Set<Tag> tag;
*/
	
	public Integer getBookno() {
		return bookno;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Translator getTranslator() {
		return translator;
	}

	public void setTranslator(Translator translator) {
		this.translator = translator;
	}

	public void setBookno(Integer bookno) {
		this.bookno = bookno;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}
