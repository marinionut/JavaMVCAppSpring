package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.domain.Job;

import java.util.List;

/**
 * Created by Ionutz on 11.05.2015.
 */
public interface JobService {
        List<Job> findAll();
        Job findOne(String id);
        void create(Job j);
        void update(Job j);
        void delete(String id);
}
