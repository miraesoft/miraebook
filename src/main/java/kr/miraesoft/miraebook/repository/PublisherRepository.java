package kr.miraesoft.miraebook.repository;

import kr.miraesoft.miraebook.domain.Publisher;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long>{
	
}
