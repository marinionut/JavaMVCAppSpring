package ro.teamnet.zth.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Job;
import ro.teamnet.zth.app.service.JobService;
import ro.teamnet.zth.app.service.impl.JobServiceImpl;

import java.util.List;

/**
 * @author andreeaf
 * @since 5/10/2015 12:36 PM
 */
@Controller
@RequestMapping("/jobs")
public class JobController {

    private JobService service = new JobServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<Job> getAllJobs() {
        return service.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Job getOneJob(@PathVariable("id") Integer idJob) {
        return service.findOne(idJob);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Job create(@RequestBody Job job) {
        return service.create(job);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Job update(@RequestBody Job job) {
        return service.update(job);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void delete(@PathVariable("id") Integer idJob) {
         service.delete(idJob);
    }
}
