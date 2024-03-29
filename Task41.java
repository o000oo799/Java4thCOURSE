package lesson02.part02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
 * Если все числа равны, вывести любое из них.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить среднее из трех чисел.
 * 4.	Если все числа равны, вывести любое из них.
 * 5.	Если два числа из трех равны, вывести любое из двух.
 */

public class Task41 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            nums.add(sc.nextInt());
        }
        nums.sort(Comparator.naturalOrder());
        System.out.println(nums.get(1));

    }
}
