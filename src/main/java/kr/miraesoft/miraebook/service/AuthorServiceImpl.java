package kr.miraesoft.miraebook.service;

import java.util.List;

import kr.miraesoft.miraebook.domain.Author;
import kr.miraesoft.miraebook.repository.AuthorRepositoryNew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	private AuthorRepositoryNew authorRepositoryNew; 
	
	public Author addAuthor(Author author) {
		return authorRepositoryNew.save(author) ;         

	}

	public Author getAuthor(Integer no) {
		return authorRepositoryNew.findOne(no);
	}

	public List<Author> getAuthorList() {
		return authorRepositoryNew.findAll();
	}

	public void deleteAuthor(Integer no) {
		authorRepositoryNew.delete(no);
	}

	public Author updateAuthor(Author author) {
		return authorRepositoryNew.save(author);
	}


}
