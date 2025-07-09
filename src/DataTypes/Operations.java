package DataTypes;

public class Operations {
    public static void main(String [] args){
        int firstNumber = 45;
        long secondNumber = 1234;
        short fourthNumber = 2;
        double seventhNumber = 2.3;
        float eighthNumber = 3.5f;
        byte third = 5;

        long sumIntAndLong = firstNumber + secondNumber;
        double subFloatAndDouble = eighthNumber - seventhNumber;
        float mulFloatAndShort = fourthNumber * eighthNumber;
        int divIntAndShort = firstNumber / fourthNumber;
        int ModIntAndShort = firstNumber % fourthNumber;

        System.out.println("subtraction float and double: " + subFloatAndDouble);
        System.out.println("sum int and long: " + sumIntAndLong);
        System.out.println("multiplication float and short: " + mulFloatAndShort);
        System.out.println("division int and short: " + divIntAndShort);
        System.out.println("remainder of the division int and short:" + ModIntAndShort);

    }
}
