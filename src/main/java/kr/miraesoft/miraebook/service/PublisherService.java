package kr.miraesoft.miraebook.service;

import java.util.List;

import kr.miraesoft.miraebook.domain.Location;
import kr.miraesoft.miraebook.domain.Publisher;

public interface PublisherService {
	Publisher add(Publisher publisher);

	List<Publisher> list();

	Publisher get(Integer id);

	Publisher update(Publisher publisher);

	void delete(Integer id);
}
