package kr.miraesoft.hyunjae.paging;

import java.util.List;

public interface PagingDao {
	
	@SuppressWarnings("rawtypes")
	List selectPageList(PagingSpec pagingSpec);

	int selectPageCount(PagingSpec pagingSpec);
}
