package Lab01.Q3;

public class Demo {
    public static void main(String[] args) {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        boolean result = evenOddNumber.findEvenOrOdd(11);
        if(result == true){
            System.out.println("number is Even");
        }else if (result == false){
            System.out.println("number is odd");
        }
        else {
            System.out.println("number is Invalid");
        }
    }
}
