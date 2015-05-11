package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.domain.Location;

import java.util.List;

/**
 * Created by Ionutz on 11.05.2015.
 */
public interface LocationService {
    List<Location> findAll();
    Location findOne(Integer id);
    void create(Location l);
    void update(Location l);
    void delete(Integer id);
}
