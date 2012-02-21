package kr.miraesoft.miraebook.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookno;

	@Column
	private String name;
	
	@Column
	private Long cost;
	
	@Transient
	private Integer location_id;
	
	@Transient
	private Integer publisher_id;
	
	@OneToOne(fetch=FetchType.EAGER)
	private Location location;
	
	@OneToOne(fetch=FetchType.EAGER)
	private Publisher publisher;	
	

/*

	@OneToOne(fetch=FetchType.EAGER)
	private Translator translator;	
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	private Set<Tag> tag;
*/
	
	public Integer getBookno() {
		return bookno;
	}

	public Integer getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	public Integer getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(Integer publisher_id) {
		this.publisher_id = publisher_id;
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
