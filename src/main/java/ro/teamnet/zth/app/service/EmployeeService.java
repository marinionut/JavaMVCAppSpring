package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.domain.Employee;

import java.util.List;

/**
 * Created by Ionutz on 07.05.2015.
 */
public interface EmployeeService {
    List<Employee> findAll();
    Employee findOne(Integer id);
    void create(Employee e);
    void update(Employee e);
    void delete(Integer id);
}
