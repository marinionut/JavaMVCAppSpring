package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.domain.Location;

import java.util.List;

/**
 * @author andreeaf
 * @since 5/10/2015 12:49 PM
 */
public interface LocationService {

    Location findOne(Integer idLocation);

    List<Location> findAll();

    Location create(Location location);

    Location update(Location location);

    void delete(Integer idLocation);

}
