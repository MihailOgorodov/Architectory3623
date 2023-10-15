package org.example.MVCApp.Model;

import java.util.List;

import org.example.MVCApp.Controller.Interfaces.iGetModel;
import org.example.MVCApp.Model.Domain.Student;

public class Model implements iGetModel {

    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
