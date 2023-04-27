//Тут хрянятся вызываемые функции.
package Java_home_work3;

import java.util.*;

public class func {
    static List<Integer> createList(int size, int min, int max) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(min, max + 1));
        }
        return list;
    }

    static void delEvenNumbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    static int findMin(List<Integer> list) {
        return Collections.min(list);
    }

    static int findMax(List<Integer> list) {
        return Collections.max(list);
    }

    static double findAverage(List<Integer> list) {
        int sum = 0;
        for (int i :
                list) {
            sum += i;
        }
        return sum / (double) list.size();
    }

    static void printPlanets(int listSize) {
        Random random = new Random();
        String[] list = {"Меркурий","Венера","Земля","Марс","Юпитер","Сатурн","Уран","Нептун"};
        List<String> newList = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            newList.add(list[random.nextInt(list.length)]);
        }
        System.out.println(newList);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " встречается " + Collections.frequency(newList, list[i]) + " раз(а)");
        }
        System.out.println();
    }

    static int[] createArray(int arraySize){
        Random random = new Random();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 11);
        }
        return array;
    }



}