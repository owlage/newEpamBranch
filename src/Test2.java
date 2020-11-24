public class Test2 {

    private int numOne;
    private int numTwo;

    public int getNumOne() {
        return numOne;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }
    public void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }

    Test2(int numberOne, int numberTwo){ //конструктор с входными параметрами

    }

    Test2(){   //конструктор инициализирующий члены класса по умолчанию
        System.out.println(numOne);
        System.out.println(numTwo);
    }
}
