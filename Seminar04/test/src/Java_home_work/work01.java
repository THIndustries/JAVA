package Java_home_work;

import java.util.Scanner;
class work01{
    public static void main(String[] args){
        //1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
            //treugolnik();
            //Вывести все простые числа от 1 до 1000
            //simplNum();
            //калькулятор
        //calculate();
    }
    //1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void treugolnik(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
    //Вывести все простые числа от 1 до 1000
    public static void simplNum(){
        int[] arr = new int[1000];
        boolean is_simp = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 2; i < arr.length; i++) {
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    is_simp = false;
                    break;
                }
            }
            if (is_simp){
                System.out.println(i);
            }else{
                is_simp = true;
            }
        }
    }
    //Калькулятор:
    public static void calculate(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String operator = sc.next();
        if (num1 != num2){
            System.out.println(num1 + num2);
        }
    }

}
