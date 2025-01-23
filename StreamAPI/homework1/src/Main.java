//Напишите программу, которая использует Stream API для обработки списка чисел.
//        Программа должна вывести на экран среднее значение всех четных чисел в списке.

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 2, 1, 8, 3, 5);

        double averageNum = list.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.printf("%.1f", averageNum);
    }
}
