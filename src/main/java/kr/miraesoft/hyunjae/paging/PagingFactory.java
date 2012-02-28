package kr.miraesoft.hyunjae.paging;

public class PagingFactory {
	public static Paging createPaging(PagingSpec pagingSpec) {
		DefaultPaging paging = new DefaultPaging(pagingSpec);
		return paging;
	}
}
