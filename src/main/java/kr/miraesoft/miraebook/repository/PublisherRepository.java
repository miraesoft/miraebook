package kr.miraesoft.miraebook.repository;

import java.util.List;

import kr.miraesoft.miraebook.domain.Publisher;

public interface PublisherRepository{

	List<Publisher> list(PublisherSearchSpec publisherSearchSpec);

	int count(PublisherSearchSpec publisherSearchSpec);

	Integer save(Publisher publisher);

	List<Publisher> findAll();

	Publisher findOne(Integer id);

	void delete(Publisher publisher);

	void update(Publisher publisher);
	
}
