package org.example.MVCApp.View;

import java.util.List;

import org.example.MVCApp.Controller.Interfaces.iGetView;
import org.example.MVCApp.Model.Domain.Student;

public class View implements iGetView {

    public void printAllStudent(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
