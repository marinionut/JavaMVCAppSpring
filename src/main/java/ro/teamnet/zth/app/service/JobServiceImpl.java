package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.dao.JobDao;
import ro.teamnet.zth.app.domain.Job;

import java.util.List;

/**
 * Created by Ionutz on 11.05.2015.
 */
public class JobServiceImpl implements JobService {
    JobDao jobDao = new JobDao();
    @Override
    public List<Job> findAll() {
        return jobDao.getAllJobs();
    }

    @Override
    public Job findOne(String id) {
        return jobDao.getJobById(id);
    }

    @Override
    public void create(Job j) {
        jobDao.insertJob(j);
    }

    @Override
    public void update(Job j) {
       jobDao.updateJob(j);
    }

    @Override
    public void delete(String id) {
        Job job = jobDao.getJobById(id);
        jobDao.deleteJob(job);
    }

}
