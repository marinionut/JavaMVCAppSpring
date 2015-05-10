package ro.teamnet.zth.app.service.impl;

import ro.teamnet.zth.app.dao.EmployeeDao;
import ro.teamnet.zth.app.domain.Employee;
import ro.teamnet.zth.app.service.EmployeeService;

import java.util.List;

/**
 * @author andreeaf
 * @since 5/10/2015 12:48 PM
 */
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();

    @Override
    public Employee findOne(Integer idEmployee) {
        return employeeDao.getEmployeeById(idEmployee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.getAllEmployees();
    }

    @Override
    public Employee create(Employee employee) {
        return employeeDao.insertEmployee(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public void delete(Integer idEmployee) {
        Employee employee = employeeDao.getEmployeeById(idEmployee);
        employeeDao.deleteEmployee(employee);
    }
}
