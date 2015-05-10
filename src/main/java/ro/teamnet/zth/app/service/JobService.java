package ro.teamnet.zth.app.service;


import ro.teamnet.zth.app.domain.Job;

import java.util.List;

/**
 * @author andreeaf
 * @since 5/10/2015 12:49 PM
 */
public interface JobService {

    Job findOne(Integer idJob);

    List<Job> findAll();

    Job create(Job job);

    Job update(Job job);

    void delete(Integer idJob);

}
