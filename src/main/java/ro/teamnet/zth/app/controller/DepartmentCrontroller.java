package ro.teamnet.zth.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import ro.teamnet.zth.api.annotations.MyController;
//import ro.teamnet.zth.api.annotations.MyRequestMethod;
import ro.teamnet.zth.app.domain.Department;
import ro.teamnet.zth.app.service.DepartmentService;
import ro.teamnet.zth.app.service.DepartmentServiceImpl;
import ro.teamnet.zth.app.service.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ionutz on 06.05.2015.
 */
@Controller
@RequestMapping(value = "/departments")
public class DepartmentCrontroller {
    /*
    public List<Department> getAllDepartment() {

        List<Department> departments = new ArrayList<>();
        Department d1 = new Department();
        d1.setId(13);
        d1.setDepartmentName("Test1");
        d1.setLocations(10001);
        departments.add(d1);

        Department d2 = new Department();
        d2.setId(14);
        d2.setDepartmentName("Test2");
        d2.setLocations(10000);
        departments.add(d2);

        return departments;

    }

    public String getOneDepartment(){
        return "oneRandomDepartment";
    }
    */
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<Department> getAllDepartments() {

        DepartmentService departmentService = new DepartmentServiceImpl();
        return departmentService.findAll();

    }

    @RequestMapping(value = "/{idDepartment}", method = RequestMethod.GET)
    public @ResponseBody
    Department getOneDepartment(@PathVariable("idDepartment") String id) {

        DepartmentService departmentService = new DepartmentServiceImpl();
        return departmentService.findOne(Integer.parseInt(id));

    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Department insertOneDepartment(@RequestBody Department department) {
        DepartmentService departmentService = new DepartmentServiceImpl();
        departmentService.create(department);
        return department;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Department updateOneDepartment(@RequestBody Department department) {
        DepartmentService departmentService = new DepartmentServiceImpl();;
        departmentService.update(department);
        return department;
    }

    @RequestMapping(value = "/{idDepartment}", method = RequestMethod.DELETE)
    //@ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody
    String deleteOneDepartment(@PathVariable("idDepartment") Integer idDepartment) {
        DepartmentService departmentService = new DepartmentServiceImpl();
        departmentService.delete(idDepartment);
        return "Department deleted";
    }
}
