package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.dao.DepartmentDao;
import ro.teamnet.zth.app.domain.Department;

import java.util.List;

/**
 * Created by Ionutz on 11.05.2015.
 */
public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public List<Department> findAll() {
        DepartmentDao departmentDao = new DepartmentDao();
        return departmentDao.getAllDepartments();
    }

    @Override
    public Department findOne(Integer id) {
        DepartmentDao departmentDao = new DepartmentDao();
        return departmentDao.getDepartmentById(id);
    }

    @Override
    public void create(Department d) {
        DepartmentDao departmentDao = new DepartmentDao();
        departmentDao.insertDepartment(d);
    }

    @Override
    public void update(Department d) {
        DepartmentDao departmentDao = new DepartmentDao();
        departmentDao.updateDepartment(d);
    }

    @Override
    public void delete(Integer id) {
        DepartmentDao departmentDao = new DepartmentDao();
        Department department = departmentDao.getDepartmentById(id);
        departmentDao.deleteDepartment(department);
    }
}
