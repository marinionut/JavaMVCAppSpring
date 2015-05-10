package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.domain.Employee;

import java.util.List;

/**
 * @author andreeaf
 * @since 5/10/2015 12:49 PM
 */
public interface EmployeeService {

    Employee findOne(Integer idEmployee);

    List<Employee> findAll();

    Employee create(Employee employee);

    Employee update(Employee employee);

    void delete(Integer idEmployee);

}
