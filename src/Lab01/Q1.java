package Lab01;

public class Q1 {

    public static void main(String[] args) {
        int miles = 26;
        int yards = 385;
        double kilometers;

        kilometers = 1.609*(miles + (yards/1760.0));
        System.out.println(kilometers);
    }
}
