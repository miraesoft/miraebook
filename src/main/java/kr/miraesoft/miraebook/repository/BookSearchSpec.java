package kr.miraesoft.miraebook.repository;

import kr.miraesoft.hyunjae.paging.PagingSpec;

public class BookSearchSpec extends PagingSpec{

	private String name;
	private String order;
	private String ordby;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getOrdby() {
		return ordby;
	}

	public void setOrdby(String ordby) {
		this.ordby = ordby;
	}
	
}
