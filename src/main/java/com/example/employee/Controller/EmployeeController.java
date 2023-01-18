package com.example.employee.Controller;

import com.example.employee.Model.Employee;
import com.example.employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class EmployeeController {
@Autowired
private EmployeeService employeeService;

@GetMapping("/all")
private List<Employee> getAllEmployees(){

    return employeeService.getAllEmployess();

}
@GetMapping("/{id}")
private Employee getEmployee(@PathVariable("id") int id){
    return employeeService.getEmployeeById(id);


}
@DeleteMapping("/{id}")
private String deleteEmployee(@PathVariable("id") int id){

    employeeService.deleteEmployee(id);
    return id+" deleted from Database";
}
@PostMapping("/add")
private String saveEmployee(@RequestBody Employee employee){
 employeeService.saveorUpdate(employee);
 //return employee.getId();
 return employee.getFirstName()+" "+employee.getLastName()+" is saved in Database";

}
@PutMapping("/update")
private Employee updateEmployee(@RequestBody Employee employee){
employeeService.saveorUpdate(employee);
return employee;
}




}
