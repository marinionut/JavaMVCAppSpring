package ro.teamnet.zth.app.service.impl;

import ro.teamnet.zth.app.dao.LocationDao;
import ro.teamnet.zth.app.domain.Location;
import ro.teamnet.zth.app.service.LocationService;

import java.util.List;

/**
 * @author andreeaf
 * @since 5/10/2015 12:56 PM
 */
public class LocationServiceImpl implements LocationService {

    private LocationDao locationDao = new LocationDao();

    @Override
    public Location findOne(Integer idLocation) {
        return locationDao.getLocationById(idLocation);
    }

    @Override
    public List<Location> findAll() {
        return locationDao.getAllLocations();
    }

    @Override
    public Location create(Location location) {
        return locationDao.insertLocation(location);
    }

    @Override
    public Location update(Location location) {
        return locationDao.updateLocation(location);
    }

    @Override
    public void delete(Integer idLocation) {
        Location location = locationDao.getLocationById(idLocation);
        locationDao.deleteLocation(location);
    }
}
