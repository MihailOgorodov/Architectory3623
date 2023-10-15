package org.example.MVCApp.Controller.Interfaces;

import java.util.List;

import org.example.MVCApp.Model.Domain.Student;

public interface iGetView {
    public void printAllStudent(List<Student> students);
}
