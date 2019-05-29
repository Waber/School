package com.schoolClass.school;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Getter
public class StudentClass {

    private String studentName;
    List<String> studentList;
    Files file = new File("C:\\Users\\Standard\\IdeaProjects\\listaUczniow.txt");

    public StudentClass(String studentName) throws IOException {
        this.studentName = studentName;

        file.createNewFile();
        studentList = file.rea
    }

    public void printStudentList(){
        System.out.println(studentList);
    }


}
