package kr.miraesoft.miraebook.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kr.miraesoft.miraebook.domain.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{
	
}
