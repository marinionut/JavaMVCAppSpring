package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.dao.LocationDao;
import ro.teamnet.zth.app.domain.Location;

import java.util.List;

/**
 * Created by Ionutz on 11.05.2015.
 */
public class LocationServiceImpl implements LocationService {

    LocationDao locationDao = new LocationDao();
    @Override
    public List<Location> findAll() {
        return locationDao.getAllLocations();
    }

    @Override
    public Location findOne(Integer id) {
        return locationDao.getLocationById(id);
    }

    @Override
    public void create(Location l) {
        locationDao.insertLocation(l);
    }

    @Override
    public void update(Location l) {
        locationDao.updateLocation(l);
    }

    @Override
    public void delete(Integer id) {
        Location location = locationDao.getLocationById(id);
        locationDao.deleteLocation(location);
    }
}
