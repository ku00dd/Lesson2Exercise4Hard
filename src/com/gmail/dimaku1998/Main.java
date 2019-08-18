/*4) С клавиатуры вводиться шестизначное число. Проверить, является ли
оно палиндромом. Примечание: палиндромом называется число, слово
или текст, которые одинакового читаются слева направо и справа налево.
Например, это числа 143341, 5555, 7117 и т. д.*/
package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Еnter a six-digit number = ");
        int number = sc.nextInt();
        System.out.println(number / 100000 == number % 10
                && number / 10000 % 10 == number % 100 / 10
                && number / 1000 % 10 == number % 1000 / 100
                ? "Number palindrome" : "Number not a palindrome");
    }
}
