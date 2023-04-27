package Java_home_work3;

import java.util.*;
import static Java_home_work3.func.*;

// Задание 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task_1 {
    public static void main(String[] args){
        List<Integer> list = createList(10, 0, 5);
        System.out.printf("Начальный список: %s", list + "\n");
        delEvenNumbers(list);
        System.out.printf("Без чётных чисел: %s", list + "\n\n");

    }
}
