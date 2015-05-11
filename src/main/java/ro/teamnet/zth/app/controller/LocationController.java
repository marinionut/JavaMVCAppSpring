package ro.teamnet.zth.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Location;
import ro.teamnet.zth.app.service.LocationService;
import ro.teamnet.zth.app.service.LocationServiceImpl;

import java.util.List;
//import ro.teamnet.zth.api.annotations.MyController;
//import ro.teamnet.zth.api.annotations.MyRequestMethod;

/**
 * Created by Ionutz on 07.05.2015.
 */

@Controller
@RequestMapping(value = "/locations")
public class LocationController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<Location> getAllLocation() {

        LocationService locationService = new LocationServiceImpl();
        return locationService.findAll();
    }

    @RequestMapping(value = "/{idLocation}", method = RequestMethod.GET)
    public @ResponseBody
    Location getOneLocation(@PathVariable("idLocation") String id) {

        LocationService jobService = new LocationServiceImpl();
        return jobService.findOne(Integer.parseInt(id));

    }

    /**
     * - /employees (POST - create, primeste pe request body un obiect
     * JSON cu informatiile despre angajatul care se creaza)
     */
    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Location insertOneLocation(@RequestBody Location location) {
        LocationService locationService = new LocationServiceImpl();
        locationService.create(location);
        return location;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Location updateOneLocation(@RequestBody Location location) {
        LocationService locationService = new LocationServiceImpl();
        locationService.update(location);
        return location;
    }

    @RequestMapping(value = "/{idLocation}", method = RequestMethod.DELETE)
    //@ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody
    String deleteOneLocation(@PathVariable("idLocation") Integer id) {
        LocationService locationService = new LocationServiceImpl();
        locationService.delete(id);
        return "Location deleted";
    }
}
