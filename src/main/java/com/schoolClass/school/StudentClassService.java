package com.schoolClass.school;

import com.schoolClass.school.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentClassService {

    private List<User> studentList = new ArrayList<>();

    public User addUser(User user) {
        studentList.add(user);
        return user;
    }


    public List<User> getAll() {
        return studentList;
    }

    public User getByIndex(Integer index) {
        return studentList.get(index);
    }

    public User removeStudent(Integer index) {
        return studentList.remove(index.intValue());
    }

    public void modifyStudentGrade(Integer index, Double grade) {
        studentList.get(index).setGrade(grade);
    }
}