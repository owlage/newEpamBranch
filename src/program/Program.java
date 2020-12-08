package program;

import service.Service;
import student.Student;

class Program {

    public static void main(String[] args) {
        Service service = new Service();
        Student [] array = service.addArrayStudent();
        service.showStudent(array);
    }
}
