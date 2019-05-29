package com.schoolClass.school;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Getter
public class StudentClass {

    private String studentName;
    List<String> studentList;
    File file = new File("C:\\Users\\Standard\\IdeaProjects\\listaUczniow.txt");
    FileReader fileReader;

    public StudentClass(String studentName) throws IOException {
        this.studentName = studentName;

        if(!file.createNewFile()){//metoda zwraca true jeśli utworzy plik, nie jeśli istnieje
            fileReader = new FileReader(file);
            studentList = Files.readAllLines(file.toPath());
        }

    }

    public void printStudentList(){
        System.out.println(studentList);
    }


}
