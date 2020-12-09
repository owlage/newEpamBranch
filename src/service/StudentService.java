package service;

import util.UtilSimplClassAndObj;
import student.Student;

public class StudentService {

    public Student studentData() {
        UtilSimplClassAndObj util = new UtilSimplClassAndObj();
        Student student = new Student();
        student.setSurname(util.readingStringFromTheKeyboard());
        System.out.println("Введите группу" + " студента");
        student.setNumGroup(util.readingNumberFromTheKeyboard());
        System.out.println("Введите успеваемость " + " студента, через enter");
        for (int j = 0; j < student.getPerformance().length; j++) {
            student.getPerformance()[j] = util.readingNumberFromTheKeyboard();
        }
        return student;
    }

    public Student[] fillTheArrayOfStudents() {
        StudentService service = new StudentService();
        Student[] array = new Student[2];
        int numStud = 1;
        for (int i = 0; i < array.length; i++) {//заполняем обьект данными
            System.out.println("Введите фамилию и инциалы " + numStud++ + " - го" + " студента.");
            array[i] = service.studentData();
        }
        return array;
    }

    public void showStudents(Student[] array) {
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

