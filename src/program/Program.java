package program;

import airline.Airlines;
import service.Service;
import service.ServiceMenu;
import util.Util;

import java.text.ParseException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        ServiceMenu serviceMenu = new ServiceMenu();
        while (true) {
            int number = serviceMenu.menu();
            if (number != 0) {
                serviceMenu.programExecution(number);
            } else {
                break;
            }
        }
    }
}
