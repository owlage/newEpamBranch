package program;

import java.util.Scanner;

public class UtilSimplClassAndObj {

    private int number;
    private String str;

    public int numberInput(){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            number = sc.nextInt();
        } else {
            System.out.println("Введите целое число");
            numberInput();
        }
        return number;
    }

    public String strInput(){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine()){
            str = sc.nextLine();
            str = str.replaceAll("[^А-Яа-я]","");
            if(str.isEmpty()){
                System.out.println("Вы ввели пустую строку");
                strInput();
            }
        } else {
            strInput();
        }
        return str;
    }

}
