package ConditionalStatements;

import java.lang.String;
import java.util.Scanner;

public class BooleanLogic {
    public static void main(String[] args){
//      Считывание с консоли
        Scanner inputFromLine = new Scanner((System.in));
        System.out.print("Введите значение a: ");
        int a = inputFromLine.nextInt();
        System.out.print("Введите значение b: ");
        int b = inputFromLine.nextInt();
        System.out.println("a + b = " + (a + b));

//      Сравнивание чисел с помощью оператора if
        if (a > b){
            System.out.println("a - самое большое число");
        }
        else if (a < b){
            System.out.println("b - самое большое число");
        }
        else {
            System.out.println("a и b равны");
        }

//      Сравнивание чисел с помощью boolean переменной

        boolean expression = a < b;
        System.out.println("Сравнивание чисел с помощью boolean переменной");
        if (expression){
            System.out.println("b - самое большое число");
        }
        else if (a > b){
            System.out.println("a - самое большое число");
        }
        else {
            System.out.println("a и b равны");
        }
    }
}
