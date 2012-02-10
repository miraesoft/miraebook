package kr.miraesoft.miraebook.service;

import java.util.List;

import kr.miraesoft.miraebook.domain.Location;

public interface LocationService {
	Integer addLocation(Location location);

	List getLocationList();

	Location getLocation(Integer id);

	void updateLocation(Location location);

	void deleteLocation(Location location);
	
}
