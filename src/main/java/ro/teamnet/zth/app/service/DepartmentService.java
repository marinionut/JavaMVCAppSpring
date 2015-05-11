package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.domain.Department;

import java.util.List;

/**
 * Created by Ionutz on 11.05.2015.
 */
public interface DepartmentService {
    List<Department> findAll();
    Department findOne(Integer id);
    void create(Department d);
    void update(Department d);
    void delete(Integer id);
}
