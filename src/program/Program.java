package program;

import service.Service;
import test1.Test1;

public class Program {

    public static void main(String[] args) {
        Service service = new Service();
        Test1 test1 = new Test1();
        service.showTest(test1);
    }
}
