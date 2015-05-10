package ro.teamnet.zth.app.service.impl;

import ro.teamnet.zth.app.dao.DepartmentDao;
import ro.teamnet.zth.app.domain.Department;
import ro.teamnet.zth.app.service.DepartmentService;

import java.util.List;

/**
 * @author andreeaf
 * @since 5/10/2015 12:53 PM
 */
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentDao departmentDao = new DepartmentDao();

    @Override
    public Department findOne(Integer idDepartment) {
        return departmentDao.getDepartmentById(idDepartment);
    }

    @Override
    public List<Department> findAll() {
        return departmentDao.getAllDepartments();
    }

    @Override
    public Department create(Department department) {
        return departmentDao.insertDepartment(department);
    }

    @Override
    public Department update(Department department) {
        return departmentDao.updateDepartment(department);
    }

    @Override
    public void delete(Integer idDepartment) {
        Department department = departmentDao.getDepartmentById(idDepartment);
        departmentDao.deleteDepartment(department);
    }
}
