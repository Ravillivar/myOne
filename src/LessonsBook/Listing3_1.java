package LessonsBook;

import java.util.Scanner;

public class Listing3_1 {
    public static void main (String [] args){
        // создаем объект input  класса сканер
        Scanner input = new Scanner(System.in);
                //переменная для хранении имени пользователя
        String name;
        // переменная для хранения отчества пользователя
        String surName;
        // переменная для хранения даты рождения пользователя
        int yearBorn;
        //переменная для хранения текущего года
        int yearNow;
        //выводим запрос данных
        System.out.print("Ваше имя: ");
        //Считываем имя (строка)
        name=input.nextLine ();
        System.out.print("Ваше отчество: ");
        //Считываем отчество (строка)
        surName=input.nextLine ();
        System.out.print("Какой сейчас год? ");
        //Считываем текущий год (целое число)
        yearNow=input.nextInt();
        System.out.print("В каком году вы родились? ");
        //Считываем год рождения (целое число)
        yearBorn=input.nextInt();
        System.out.println("Здраствуйте,  " +name+" "+surName+"!");
        System.out.println("Ваш возраст: " + (yearNow-yearBorn)+"лет.");



    }
}
