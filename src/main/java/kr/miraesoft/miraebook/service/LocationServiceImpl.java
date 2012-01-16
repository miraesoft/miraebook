package kr.miraesoft.miraebook.service;

import org.springframework.beans.factory.annotation.Autowired;

import kr.miraesoft.miraebook.domain.Location;
import kr.miraesoft.miraebook.repository.LocationRepository;

public class LocationServiceImpl implements LocationService {
	
	@Autowired
	LocationRepository locationRepository;
	
	public void addLocation(Location location) {
		// TODO Auto-generated method stub

	}

}
