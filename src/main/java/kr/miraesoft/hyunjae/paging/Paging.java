package kr.miraesoft.hyunjae.paging;

import java.util.List;

/**
 *          startPage                 endPage
 * 		<      11     12  13....  19     20      >
 * prevPage                                   nextPage
 * @author xperjune
 */
@SuppressWarnings("rawtypes")
public interface Paging {
	public void setList(List list);

	public void setTotal(int total);
	
	public List getList();
	
	public int getTotal();
	
	public int getCounter();

	public int getCurrPage();

	public int getStartPage();

	public int getEndPage();

	public boolean hasNextPage();

	public boolean hasPrevPage();

	public int getPrevPage();

	public int getNextPage();
}
