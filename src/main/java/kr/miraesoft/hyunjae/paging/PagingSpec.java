package kr.miraesoft.hyunjae.paging;

public class PagingSpec implements Scope{
	
	/**
	 * 현재 페이지 번호
	 */
	private int currPage = 1;
	
	/**
	 * 페이지 사이즈
	 */
	private int pageSize = 10;

	/**
	 * 페이지당 게시물 수
	 */
	private int listSize = 15;
	
	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getListSize() {
		return listSize;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}


	public int getFrom() {
		return ( (getCurrPage() - 1) * getListSize() ) + 1 ;
	}

	public int getTo() {
		return ( getFrom() + getListSize() ) - 1;
	}

	public int getSize() {
		return getListSize();
	}

}
