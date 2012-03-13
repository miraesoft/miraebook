package kr.miraesoft.miraebook.service;

import java.util.List;

import kr.miraesoft.hyunjae.paging.Paging;
import kr.miraesoft.hyunjae.paging.PagingFactory;
import kr.miraesoft.miraebook.domain.Publisher;
import kr.miraesoft.miraebook.repository.PublisherRepository;
import kr.miraesoft.miraebook.repository.PublisherSearchSpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PublisherServiceImpl implements PublisherService {
	
	@Autowired
	PublisherRepository publisherRepository;
	
	public Integer add(Publisher publisher) {
		// TODO Auto-generated method stub
		return publisherRepository.save(publisher);
	}

	public List<Publisher> list() {
		// TODO Auto-generated method stub
		return publisherRepository.findAll();
	}

	public Publisher get(Integer id) {
		// TODO Auto-generated method stub
		return publisherRepository.findOne(id);
	}

	public void update(Publisher publisher) {
		// TODO Auto-generated method stub
		publisherRepository.update(publisher);
	}

	public void delete(Publisher publisher) {
		// TODO Auto-generated method stub
		publisherRepository.delete(publisher);
	}

	@Override
	public Paging getPagingList(PublisherSearchSpec publisherSearchSpec) {
		Paging paging = PagingFactory.createPaging(publisherSearchSpec);
		List<Publisher> list =  publisherRepository.list(publisherSearchSpec);
		paging.setList(list);
		paging.setTotal(publisherRepository.count(publisherSearchSpec));
		return paging;
	}

}
