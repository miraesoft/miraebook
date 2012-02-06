package kr.miraesoft.miraebook.domain;

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
	/*
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	private Location location;
	    
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	private Publisher publisher;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	private Set<Tag> tag;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	private Translator translator;
*/
	
	public Integer getBookno() {
		return bookno;
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

	/*
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Set<Tag> getTag() {
		return tag;
	}

	public void addTag(Tag tag) {
		this.tag.add(tag);
	}

	public Translator getTranslator() {
		return translator;
	}

	public void setTranslator(Translator translator) {
		this.translator = translator;
	}
*/
	
}
