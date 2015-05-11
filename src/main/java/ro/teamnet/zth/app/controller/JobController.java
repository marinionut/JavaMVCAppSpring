package ro.teamnet.zth.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import ro.teamnet.zth.api.annotations.MyController;
//import ro.teamnet.zth.api.annotations.MyRequestMethod;
import ro.teamnet.zth.api.annotations.MyRequestParameters;
import ro.teamnet.zth.app.domain.Job;
import ro.teamnet.zth.app.service.JobService;
import ro.teamnet.zth.app.service.JobServiceImpl;

import java.util.List;


/**
 * Created by Ionutz on 07.05.2015.
 */

@Controller
@RequestMapping(value = "/jobs")
public class JobController {


    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<Job> getAllJob() {

        JobService jobService = new JobServiceImpl();
        return jobService.findAll();

    }

    @RequestMapping(value = "/{idJob}", method = RequestMethod.GET)
    public @ResponseBody
    Job getOneJob(@PathVariable("idJob") String id) {

        JobService jobService = new JobServiceImpl();
        return jobService.findOne(id);

    }

    /**
     * - /employees (POST - create, primeste pe request body un obiect
     * JSON cu informatiile despre angajatul care se creaza)
     */
    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Job insertOneJob(@RequestBody Job job) {
        JobService jobService = new JobServiceImpl();
        jobService.create(job);
        return job;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Job updateOneJob(@RequestBody Job job) {
        JobService jobService = new JobServiceImpl();
        jobService.update(job);
        return job;
    }

    @RequestMapping(value = "/{idJob}", method = RequestMethod.DELETE)
    //@ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody
    String deleteOneJob(@PathVariable("idJob") String id) {
        JobService jobService = new JobServiceImpl();
        jobService.delete(id);
        return "Job deleted";
    }

}
