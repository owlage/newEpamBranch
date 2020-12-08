package service;

import program.UtilSimplClassAndObj;
import student.Student;

public class Service {

    public Student addStudent() {
        UtilSimplClassAndObj util = new UtilSimplClassAndObj();
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

    public Student[] addArrayStudent() {
        Service service = new Service();
        Student[] array = new Student[10];
        int numStud = 1;
        for (int i = 0; i < array.length; i++) {//заполняем обьект данными
            System.out.println("Введите фамилию и инциалы " + numStud++ + " - го" + " студента.");
            array[i] = service.addStudent();
        }
        return array;
    }

    public void showStudent(Student[] array) {
        int temp = 0; //счётчик студентов с баллами 9 и 10, если таких нет, то программа сообщит
        for (int i = 0; i < array.length; i++) {
            boolean bool = true;
            for (int j = 0; j < array[i].getPerformance().length; j++) {
                if (array[i].getPerformance()[j] < 9) {
                    bool = false;
                }
            }
            if (bool) {
                temp++;
                System.out.println("ФИО студента");
                System.out.println(array[i].getSurname());
                System.out.println("№ группы");
                System.out.println(array[i].getNumGroup());
                System.out.println("Оценки");
                for (int appraisal : array[i].getPerformance()) {
                    System.out.print(appraisal + " ");
                }
                System.out.println();
            }
        }
        if (temp == 0) {
            System.out.println("Нет студентов с баллами 9 и 10");
        }
    }
}

