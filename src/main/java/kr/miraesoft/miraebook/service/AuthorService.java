package kr.miraesoft.miraebook.service;

import kr.miraesoft.miraebook.domain.Author;

public interface AuthorService {

	void addAuthor(Author author);

	Author getAuthor(int i);

}
