package kr.miraesoft.miraebook.repository;

import kr.miraesoft.miraebook.domain.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AuthorRepositoryNew extends JpaRepository<Author, Integer>{
  
}
