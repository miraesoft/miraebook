package kr.miraesoft.miraebook.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import kr.miraresoft.miraebook.enumtype.FormType;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookno;

	@Column
	private String name;

	@Column
	private Long price;

	@Column
	private Long purchaseprice;

	@Column
	private String publishdate;

	@Column
	private String purchasedate;

	@Column
	private String wheretobuy;

	@Column
	private String pages;

	@Column
	private FormType formtype;

	@Transient
	private Integer location_id;

	@Transient
	private Integer publisher_id;

	@Transient
	private Integer translator_no;

	@Transient
	private Integer[] tag_ids;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Location location;

	@OneToOne(fetch = FetchType.EAGER)
	private Publisher publisher;

	@ManyToMany(fetch = FetchType.EAGER, targetEntity = Tag.class, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "BOOK_TAG", joinColumns = { @JoinColumn(name = "bookno") }, inverseJoinColumns = { @JoinColumn(name = "id") })
	private Collection<Tag> tags;

	@OneToOne(fetch = FetchType.EAGER)
	private Translator translator;

	/*
	 * 
	 * @OneToOne(fetch=FetchType.EAGER) private Translator translator;
	 * 
	 * @OneToMany(fetch=FetchType.LAZY)
	 * 
	 * @JoinColumn(name="id") private Set<Tag> tag;
	 */
	
	
	public Translator getTranslator() {
		return translator;
	}

	public Integer[] getTag_ids() {
		return tag_ids;
	}

	public void setTag_ids(Integer[] tag_ids) {
		if(tag_ids != null){
			ArrayList<Tag> templist = new ArrayList<Tag>();
			for(Integer tempno : tag_ids){
				Tag tag = new Tag();
				tag.setId(tempno);
				templist.add(tag);
			}
			this.tags = templist;
		}
		this.tag_ids = tag_ids;
	}

	public Integer getTranslator_no() {
		return translator_no;
	}

	public void setTranslator_no(Integer translator_no) {
		this.translator = new Translator();
		this.translator.setNo(translator_no);
		this.translator_no = translator_no;
	}

	public void setTranslator(Translator translator) {
		this.translator = translator;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getPurchaseprice() {
		return purchaseprice;
	}

	public void setPurchaseprice(Long purchaseprice) {
		this.purchaseprice = purchaseprice;
	}

	public String getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}

	public String getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(String purchasedate) {
		this.purchasedate = purchasedate;
	}

	public String getWheretobuy() {
		return wheretobuy;
	}

	public void setWheretobuy(String wheretobuy) {
		this.wheretobuy = wheretobuy;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public FormType getFormtype() {
		return formtype;
	}

	public void setFormtype(FormType formtype) {
		this.formtype = formtype;
	}

	public Integer getBookno() {
		return bookno;
	}

	public Collection<Tag> getTags() {
		return tags;
	}

	public void setTags(Collection<Tag> tags) {
		this.tags = tags;
	}

	public Integer getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Integer location_id) {
		this.location = new Location();
		this.location.setId(location_id);
		this.location_id = location_id;
	}

	public Integer getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(Integer publisher_id) {
		this.publisher = new Publisher();
		this.publisher.setId(publisher_id);
		this.publisher_id = publisher_id;
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
