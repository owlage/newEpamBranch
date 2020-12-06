package service;

import program.UtilSimplClassAndObj;
import student.Student;

public class Service {

    UtilSimplClassAndObj util = new UtilSimplClassAndObj();

    public Student addStudent(){

        Student student = new Student();
        student.setSurname(util.strInput());
        System.out.println("Введите группу" + " студента");
        student.setNumber(util.numberInput());
        System.out.println("Введите успеваемость " + " студента, через enter");
        for (int j = 0; j < student.getPerformance().length; j++) {
            student.getPerformance()[j] = util.numberInput();
        }
        return student;
    }
}
