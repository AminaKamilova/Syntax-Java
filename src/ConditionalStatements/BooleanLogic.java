package ConditionalStatements;

import java.util.Scanner;

public class BooleanLogic {
    public static void main(String [] args){
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


//    Вывод сообщений с помощью строковых переменных

        String firstNumber = "Введите значение c: ";
        String secondNumber = "Введите значение d: ";
        String firstIsBigger = "c - самое большое число";
        String secondIsBigger = "d - самое большое число";
        String numAreEquals = "c и d равны";


        System.out.print(firstNumber);
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
