import java.util.Scanner;

public class Util {

    private double num;

    public double numInput(){
        System.out.println("Введите координаты");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextDouble()){
            num = sc.nextDouble();
            if(num <= 0){
                System.out.println("Введите положительные координаты");
                numInput();
            }
        } else {
            System.out.println("Вы допустили ошибку при вводе");
            numInput();
        }
        return num;
    }
}
