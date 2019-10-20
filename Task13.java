package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
 * «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
 * если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».
 * Пример для номера 5:
 * пятница
 * Пример для номера 10:
 * такого дня недели не существует
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать число c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Если введено число от 1 до 7, необходимо вывести день недели.
 * 4.	Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
 */

public class Task13 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String num = bufferedReader.readLine();
        int num1 = Integer.parseInt(num);
        if (num1==1)
        {
            System.out.println("Monday");
        }
        if (num1==2)
        {
            System.out.println("Tuesday");
        }
        if (num1==3)
        {
            System.out.println("Wednesday");
        }
        if (num1==4)
        {
            System.out.println("Thursday");
        }
        if (num1==5)
        {
            System.out.println("Friday");
        }
        if (num1==6)
        {
            System.out.println("Saturday");
        }
        if (num1==7)
        {
            System.out.println("Sunday");
        }
        else if (num1>7)
        {
            System.out.println("The day does not exist");
        }


    }
}