package com.tw.apistackbase.controller;

import com.tw.apistackbase.object.Employee;
import com.tw.apistackbase.service.EmpolyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    private EmpolyeeService empolyeeService;

    @Autowired
    public EmployeeController(EmpolyeeService empolyeeService){
        this.empolyeeService = empolyeeService;
    }

    @GetMapping(produces = {"application/json"})
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(empolyeeService.getAll());
    }

    @PostMapping(produces = {"application/json"})
    public ResponseEntity<Employee> create(@RequestBody Employee employee){

      return ResponseEntity.ok(empolyeeService.create(employee));
    }

    @PutMapping(path = "/{id}", produces = {"application/json"})
    public ResponseEntity<Employee> update(@PathVariable Integer id, @RequestBody Employee employee){
        return ResponseEntity.ok(empolyeeService.update(id,employee));
    }

    @DeleteMapping(path = "/{id}", produces = {"application/json"})
    public ResponseEntity<Employee> delete(@PathVariable Integer id){
        return ResponseEntity.ok(empolyeeService.delete(id));
    }

    @GetMapping(path = "/{id}", produces = {"application/json"})
    public ResponseEntity<Employee> getSpecific(@PathVariable Integer id){
        return ResponseEntity.ok(empolyeeService.getSpecific(id));
    }


}













