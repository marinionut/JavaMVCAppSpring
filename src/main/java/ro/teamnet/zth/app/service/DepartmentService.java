package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.domain.Department;

import java.util.List;

/**
 * @author andreeaf
 * @since 5/10/2015 12:49 PM
 */
public interface DepartmentService {

    Department findOne(Integer idDepartment);

    List<Department> findAll();

    Department create(Department department);

    Department update(Department department);

    void delete(Integer idDepartment);

}
