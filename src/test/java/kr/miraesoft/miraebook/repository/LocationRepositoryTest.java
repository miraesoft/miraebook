package kr.miraesoft.miraebook.repository;
import static org.junit.Assert.*;

import javax.inject.Inject;

import kr.miraesoft.miraebook.domain.Location;
import kr.miraesoft.miraebook.domain.LocationType;
import kr.miraesoft.miraebook.repository.LocationRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/applicationContext.xml"})
@TransactionConfiguration(defaultRollback =true)
public class LocationRepositoryTest {

	@Inject LocationRepository locationRepository;
	
	@Test
	public void 책저장소를_등록합니다() throws Exception {
		//begin
		Location location = new Location();
//		location.setId(1);
		location.setName("디자인패턴");
//		location.setLocationType(LocationType.IT);
		
		//when
		Integer id = locationRepository.saveLocation(location);
		
		//begin
//		location = new Location();
////		location.setId(2);
//		location.setName("1Q84");
////		location.setLocationType(LocationType.FICTION);
//		
//		//when
//		locationRepository.saveLocation(location);
		
		//then.
		assertEquals(locationRepository.findOne(id).getName(), "디자인패턴");
	}
	
	@Test
	public void 책저장소를_수정합니다() throws Exception {
		//begin
		Location loc = locationRepository.findOne(1);
		loc.setName("도메인주도개발");
		
		//when
		locationRepository.reflush(loc);
		loc = locationRepository.findOne(1);
		
		//then
		assertEquals(loc.getName(), "도메인주도개발");
		
	}
	
	
	@Test
	public void 책저장소를_삭제합니다() throws Exception {
		//begin
		Location loc = locationRepository.findOne(1);
		
		//when
		locationRepository.delete(loc);
		loc = locationRepository.findOne(loc.getId());
		//then
		assertNull(loc);
			
	}
}
