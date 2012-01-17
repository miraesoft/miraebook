package kr.miraesoft.miraebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.miraesoft.miraebook.domain.Tag;

public interface TagJpaRepository extends JpaRepository<Tag, Integer> {

	
}
