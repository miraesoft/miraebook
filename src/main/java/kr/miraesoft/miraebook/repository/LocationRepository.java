package kr.miraesoft.miraebook.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kr.miraesoft.miraebook.domain.Location;
@Repository
//public interface LocationRepository extends JpaRepository<Location, Integer>{
public interface LocationRepository {

	Integer saveLocation(Location location);

	List findAll();

	Location findOne(Integer id);

	void reflush(Location location);

	void delete(Location loc);
	
}
