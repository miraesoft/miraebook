package kr.miraesoft.miraebook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.miraesoft.miraebook.domain.Location;
import kr.miraesoft.miraebook.domain.Publisher;
import kr.miraesoft.miraebook.repository.LocationRepository;
import kr.miraesoft.miraebook.repository.PublisherRepository;

@Service
public class PublisherServiceImpl implements PublisherService {
	
	@Autowired
	PublisherRepository publisherRepository;
	
	public Publisher add(Publisher publisher) {
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

	public Publisher update(Publisher publisher) {
		// TODO Auto-generated method stub
		return publisherRepository.save(publisher);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		publisherRepository.delete(id);
	}

}
