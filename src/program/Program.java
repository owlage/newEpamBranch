package program;

import service.Service;
import student.Student;

class Program {

    public static void main(String[] args) {
        Service service = new Service();
        Student[] array = new Student[10];
        int numStud = 1;
        for (int i = 0; i < array.length; i++) {//заполняем обьект данными
            System.out.println("Введите фамилию и инциалы " + numStud++ + " - го" + " студента. (кирилица)");
            array[i] = service.addStudent();
        }
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
