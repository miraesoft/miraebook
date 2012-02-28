package kr.miraesoft.hyunjae.paging;

import java.util.List;

@SuppressWarnings("rawtypes")
public abstract class AbstractPaging implements Paging {
	protected PagingSpec pagingSpec;

	protected int total;

	protected List list;

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getCurrPage() {
		return pagingSpec.getCurrPage();
	}

	public int getEndPage() {
		int endPage = getStartPage() + pagingSpec.getPageSize() - 1;
		return (endPage >= getTotalPage()) ? getTotalPage() : endPage;
	}

	public int getTotalPage() {
		int listsize = pagingSpec.getListSize();
		if (total / listsize == 0)
			return 1;
		return (total % listsize == 0) ? total / listsize : total / listsize + 1;
	}

	public int getNextPage() {
		return getEndPage() + 1;
	}

	public int getPrevPage() {
		return getStartPage() - 1;
	}

	public int getStartPage() {
		int pageSize = pagingSpec.getPageSize();
		int startPage = ((getCurrPage() - 1) / pageSize) * pageSize + 1;
		return startPage;
	}

	public boolean hasNextPage() {
		return getNextPage() < getTotalPage();
	}

	public boolean hasPrevPage() {
		return getPrevPage() > 1;
	}

	public int getCounter() {
		return total - (pagingSpec.getCurrPage() - 1) * pagingSpec.getListSize();
	}

	public int getTotal() {
		return total;
	}

	public PagingSpec getPagingSpec() {
		return pagingSpec;
	}

	public void setPagingSpec(PagingSpec pagingSpec) {
		this.pagingSpec = pagingSpec;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
