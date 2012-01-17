package kr.miraesoft.miraebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.miraesoft.miraebook.domain.Author;
import kr.miraesoft.miraebook.repository.AuthorRepository;


@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	private AuthorRepository authorRepository; 
	
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		authorRepository.insertAuthor(author);

	}

	public Author getAuthor(int i) {
		// TODO Auto-generated method stub
		return new Author();
	}

}
