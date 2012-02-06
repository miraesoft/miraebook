package kr.miraesoft.miraebook.service;

import java.util.List;

import kr.miraesoft.miraebook.domain.Author;

public interface AuthorService {

	Author addAuthor(Author author);

	Author getAuthor(Integer no);

	List<Author> getAuthorList();

	void deleteAuthor(Integer no);

	Author updateAuthor(Author author);


}
