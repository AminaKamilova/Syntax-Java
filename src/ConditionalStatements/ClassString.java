package ConditionalStatements;
import java.util.Scanner;
import java.lang.String;


public class ClassString{
    public static void main(String[] args){
        //    Вывод сообщений с помощью строковых переменных
        String firstNumber = "Введите значение c: ";
        String secondNumber = "Введите значение d: ";
        String firstIsBigger = "c - самое большое число";
        String secondIsBigger = "d - самое большое число";
        String numAreEquals = "c и d равны";


        System.out.print(firstNumber);
        Scanner inputFromLine = new Scanner((System.in));
        int c = inputFromLine.nextInt();
        System.out.print(secondNumber);
        int d = inputFromLine.nextInt();
        if (c > d){
            System.out.println(firstIsBigger);
        } else if (c < d) {
            System.out.println(secondIsBigger);
        }
        else {
            System.out.println(numAreEquals);
        }
    }
}
