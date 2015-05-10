package ro.teamnet.zth.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Employee;
import ro.teamnet.zth.app.service.EmployeeService;
import ro.teamnet.zth.app.service.impl.EmployeeServiceImpl;

import java.util.List;

/**
 * @author andreeaf
 * @since 5/6/2015 11:13 AM
 */
@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService service = new EmployeeServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<Employee> getAllEmployees() {
        return service.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    Employee getOneEmployee(@PathVariable("id") Integer idEmployee) {
        return service.findOne(idEmployee);
    }

    @RequestMapping(method = RequestMethod.POST)
    public
    @ResponseBody
    Employee create(@RequestBody Employee employee) {
        return service.create(employee);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public
    @ResponseBody
    Employee update(@RequestBody Employee employee) {
        return service.update(employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void delete(@PathVariable("id") Integer idEmployee) {
        service.delete(idEmployee);
    }
}