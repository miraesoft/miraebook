package kr.miraesoft.miraebook.repository;

import kr.miraesoft.miraebook.domain.Publisher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer>{
	
}
