package LanguageConstructs;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        int[] mass = new int[10];
        int[] secondMass = new int[]{10, 23, 24, 45, 67};

        Scanner input = new Scanner(System.in);
        int[] thirdMass = new int[5];
        for (int i = 0; i < 5; i++) {
            int newElement = i + 1;
            mass[i] = newElement;
            System.out.println("Элемент под индексом " + i + " заполняется значением " + mass[i]);
        }


//      Модифицируем цикл
        System.out.println("\nЗаполняем массив значениями!");
        for (int i = 0; i < 5; i++){
            System.out.print("Элемент " + (i+1) + ": ");
            int newElement = input.nextInt();
            mass[i] = newElement;
        }
        System.out.println("Выводим массив!");
        System.out.print("Массив: ");
        for (int i = 0; i < 5; i++){
            System.out.print(mass[i] + " ");
        }
    }
}
