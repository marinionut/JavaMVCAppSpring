package ro.teamnet.zth.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Department;
import ro.teamnet.zth.app.service.DepartmentService;
import ro.teamnet.zth.app.service.impl.DepartmentServiceImpl;

import java.util.List;

/**
 * @author andreeaf
 * @since 5/10/2015 12:31 PM
 */
@Controller
@RequestMapping("/departments")
public class DepartmentController {

    private DepartmentService service = new DepartmentServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<Department> getAllDepartments() {
        return service.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Department getOneDepartment(@PathVariable("id") Integer idDepartment) {
        return service.findOne(idDepartment);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Department create(@RequestBody Department department) {
        return service.create(department);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Department update(@RequestBody Department department) {
        return service.create(department);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void delete(@PathVariable("id") Integer idDepartment) {
         service.delete(idDepartment);
    }
}
