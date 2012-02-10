package kr.miraesoft.miraebook.domain;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LOCATION")
public class Location {
	
	@Id 
	@Column(nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = true)
	private Integer hLocIndex;
	
	@Column(nullable = true)
	private Integer wLocIndex;
	
	@Column(nullable = true)
	private LocationType locationType;
	
//	@Column(nullable = true)
//	private Collection<Book> books = new HashSet<Book>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer gethLocIndex() {
		return hLocIndex;
	}
	public void sethLocIndex(Integer hLocIndex) {
		this.hLocIndex = hLocIndex;
	}
	public Integer getwLocIndex() {
		return wLocIndex;
	}
	public void setwLocIndex(Integer wLocIndex) {
		this.wLocIndex = wLocIndex;
	}
	public LocationType getLocationType() {
		return locationType;
	}
	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}
	
//	@OneToMany
//	public Collection<Book> getBooks() {
//		return books;
//	}
//	public void setBooks(Collection<Book> books) {
//		this.books = books;
//	}
	
	
}
