package program;

import service.StudentService;
import student.Student;

class Program {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student [] array = service.fillTheArrayOfStudents();
        service.showStudents(array);
    }
}
