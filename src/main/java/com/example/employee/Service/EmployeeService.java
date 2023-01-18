package com.example.employee.Service;

import com.example.employee.Model.Employee;
import com.example.employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
@Autowired
private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployess(){
        List<Employee> allEmployees=new ArrayList<>();
        employeeRepository.findAll().forEach(emp->allEmployees.add(emp));
        return allEmployees;

    }

    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id).get();
    }

    public void saveorUpdate(Employee employee){
        employeeRepository.save(employee);

    }

    public void deleteEmployee(int id){

        employeeRepository.deleteById(id);
    }
}
