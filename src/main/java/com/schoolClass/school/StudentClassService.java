package com.schoolClass.school;

import com.schoolClass.school.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
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

    public void removeStudent(Integer index){
        studentList.remove(index);
    }

    public void modifyStudentGrade(Integer index, Double grade) {
        studentList.get(index).setGrade(grade);
    }
}
