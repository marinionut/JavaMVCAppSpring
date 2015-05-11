package ro.teamnet.zth.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import ro.teamnet.zth.api.annotations.MyController;
//import ro.teamnet.zth.api.annotations.MyRequestMethod;
import ro.teamnet.zth.api.annotations.MyRequestParameters;
import ro.teamnet.zth.app.domain.Employee;
import ro.teamnet.zth.app.service.EmployeeService;
import ro.teamnet.zth.app.service.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ionutz on 06.05.2015.
 */
@Controller
@RequestMapping(value = "/employees")
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<Employee> getAllEmployees() {

        EmployeeService employeeService = new EmployeeServiceImpl();
        return employeeService.findAll();

    }

    @RequestMapping(value = "/{idEmployee}", method = RequestMethod.GET)
    public @ResponseBody
    Employee getOneEmployee(@PathVariable("idEmployee") String id) {

        EmployeeService employeeService = new EmployeeServiceImpl();
        return employeeService.findOne(Integer.parseInt(id));

    }

    /**
     * - /employees (POST - create, primeste pe request body un obiect
     * JSON cu informatiile despre angajatul care se creaza)
     */
    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Employee insertOneEmployee(@RequestBody Employee employee) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.create(employee);
        return employee;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Employee updateOneEmployee(@RequestBody Employee employee) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.update(employee);
        return employee;
    }

    @RequestMapping(value = "/{idEmployee}", method = RequestMethod.DELETE)
    //@ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody
    String deleteOneEmployee(@PathVariable("idEmployee") Integer id) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.delete(id);
        return "Employee deleted";
    }
}
