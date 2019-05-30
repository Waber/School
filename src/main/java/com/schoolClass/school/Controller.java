package com.schoolClass.school;


import com.schoolClass.school.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/students")
public class Controller {


    private final StudentClassService studentClassService;

    @Autowired
    public Controller(StudentClassService studentClassService) {
        this.studentClassService = studentClassService;
    }

    @PostMapping
    @ResponseBody
    public User studentClass(@RequestBody User user) {
        return studentClassService.addUser(user);
    }


    @GetMapping("/{index}")
    @ResponseBody
    public User getByIndex(@PathVariable("index") Integer index){
        return studentClassService.getByIndex(index);
    }

    @GetMapping
    @ResponseBody
    public List<User> getAll(){
        return studentClassService.getAll();
    }

    @GetMapping("/remove/{index}")
    @ResponseBody
    public List<User> removeStudent(@PathVariable("index") Integer index){
         studentClassService.removeStudent(index);
         return studentClassService.getAll();
    }

    @GetMapping("/modify/{index}/{grade}")
    @ResponseBody
    public User modifyGrades(@PathVariable("index") Integer index, @PathVariable("grade") Double grade){
        studentClassService.modifyStudentGrade(index, grade);
        return studentClassService.getByIndex(index);
    }


}
