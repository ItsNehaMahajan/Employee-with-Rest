package com.company.Employee.Controller;

import org.springframework.ui.Model;

import com.company.Employee.EmployeeRepository;
import com.company.Employee.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller

public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/index")
    public void index(Model model) {
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);

    }

}
