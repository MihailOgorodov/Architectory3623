package org.example.MVCApp.Controller;

import java.util.List;

import org.example.MVCApp.Controller.Interfaces.iGetModel;
import org.example.MVCApp.Controller.Interfaces.iGetView;
import org.example.MVCApp.Model.Model;
import org.example.MVCApp.Model.Domain.Student;
import org.example.MVCApp.View.View;

public class Controller {

    private iGetModel model;
    private iGetView view;

    private List<Student> students;

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studs)
    {
        if(studs.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update()
    {
        //MVP
        students = model.getAllStudents();

        if(testData(students))
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }



        //MVC
        // view.printAllStudent(model.getAllStudents());

    }

}
