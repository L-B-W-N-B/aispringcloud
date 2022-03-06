package com.huas.controller;


import com.huas.entity.Student;
import com.huas.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Autowired
    private StudentRepository repository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return repository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return repository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        repository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        repository.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        repository.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口"+this.port;
    }
}
