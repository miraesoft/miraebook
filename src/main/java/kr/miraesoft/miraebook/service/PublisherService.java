package kr.miraesoft.miraebook.service;

import java.util.List;

import kr.miraesoft.hyunjae.paging.Paging;
import kr.miraesoft.miraebook.domain.Publisher;
import kr.miraesoft.miraebook.repository.PublisherSearchSpec;

public interface PublisherService {
	Integer add(Publisher publisher);

	List<Publisher> list();

	Publisher get(Integer id);

	void update(Publisher publisher);

	void delete(Publisher publisher);

	Paging getPagingList(PublisherSearchSpec publisherSearchSpec);

}
