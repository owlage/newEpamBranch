package triangle;

import util.Util;

public class MedianaService {

    private Util util = new Util();

    public Mediana medianCheck(){
        System.out.println("Введите 2 координаты точек через enter");
        Mediana mediana = new Mediana(util.readingNumberFromTheKeyboard(), util.readingNumberFromTheKeyboard());
        return  mediana;
    }
}
