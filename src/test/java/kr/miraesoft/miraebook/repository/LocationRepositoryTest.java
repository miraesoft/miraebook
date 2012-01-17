package kr.miraesoft.miraebook.repository;
import static org.junit.Assert.*;
import kr.miraesoft.miraebook.domain.Location;
import kr.miraesoft.miraebook.domain.LocationType;
import kr.miraesoft.miraebook.repository.LocationRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/applicationContext.xml"})
public class LocationRepositoryTest {

	@Autowired LocationRepository locationRepository;
	
	@Test
	public void 책저장소를_등록합니다() throws Exception {
		//begin
		Location location = new Location();
		location.setId(1L);
		location.setName("디자인패턴");
		location.setLocationType(LocationType.IT);
		
		//when
		locationRepository.save(location);
		
		//begin
		location = new Location();
		location.setId(2L);
		location.setName("1Q84");
		location.setLocationType(LocationType.FICTION);
		
		//when
		locationRepository.save(location);
		
		//then.
		assertEquals(locationRepository.findAll().size(), 2);
	}
	
	@Test
	public void 책저장소를_수정합니다() throws Exception {
		//begin
		Location loc = locationRepository.findOne(1L);
		loc.setName("도메인주도개발");
		
		//when
		locationRepository.save(loc);
		loc = locationRepository.findOne(1L);
		
		//then
		assertEquals(loc.getName(), "도메인주도개발");
		
	}
	
	
	@Test
	public void 책저장소를_삭제합니다() throws Exception {
		//begin
		Location loc = locationRepository.findOne(2L);
		
		//when
		
		//then
		assertEquals(loc.getName(), "1Q84");
			
	}
}
