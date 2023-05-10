package Java_home_work3;

import java.util.List;
import static Java_home_work3.func.*;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
// Collections.max()
public class Task_2 {
    public static void main(String[] args){
        List<Integer> list2 = createList(10, 0, 10);
        System.out.println(list2);
        System.out.println("Максимальное значение: " + findMax(list2));
        System.out.println("Минимальное значение: " + findMin(list2));
        System.out.println("Среднее арифметическое: " + findAverage(list2) + "\n");
    }
}
