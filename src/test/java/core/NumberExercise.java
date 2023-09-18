package core;

public class NumberExercise {

    public static void main(String[] args) {
        String printNumber = NumberExercise.enterNumber(14);
        System.out.println(printNumber);
    }

    public static String enterNumber(int number) {
        switch (number) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
        }
        return "Not matched";
    }
}
