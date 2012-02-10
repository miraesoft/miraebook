package kr.miraesoft.miraebook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.miraesoft.miraebook.domain.Location;
import kr.miraesoft.miraebook.repository.LocationRepository;

@Service
//@Transactional
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	LocationRepository locationRepository;
	
	public Integer addLocation(Location location) {
//		return locationRepository.save(location);
		return locationRepository.saveLocation(location);
	}

	public List getLocationList() {
		return locationRepository.findAll();
	}

	public Location getLocation(Integer id) {
		return locationRepository.findOne(id);
	}

	public void updateLocation(Location location) {
		locationRepository.reflush(location);
	}

	public void deleteLocation(Location location) {
		locationRepository.delete(location);
	}

}
