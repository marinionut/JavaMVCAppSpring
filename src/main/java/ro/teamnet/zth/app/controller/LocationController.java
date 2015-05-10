package ro.teamnet.zth.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Location;
import ro.teamnet.zth.app.service.LocationService;
import ro.teamnet.zth.app.service.impl.LocationServiceImpl;

import java.util.List;

/**
 * @author andreeaf
 * @since 5/10/2015 12:43 PM
 */
@Controller
@RequestMapping("/locations")
public class LocationController {

    private LocationService service = new LocationServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<Location> getAllLocations() {
        return service.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Location getOneLocation(@PathVariable("id") Integer idLocation) {
        return service.findOne(idLocation);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Location create(@RequestBody Location location) {
        return service.create(location);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Location update(@RequestBody Location location) {
        return service.update(location);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void delete(@PathVariable("id") Integer idLocation) {
        service.delete(idLocation);
    }
}
