import java.util.Scanner;


class home01{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
            //treugolnik();
            //Вывести все простые числа от 1 до 1000
            //simplNum();
            //калькулятор
            //calculate();
            array();
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
        System.out.print("Введите первый операнд: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второй операнд: ");
        int num2 = sc.nextInt();
        System.out.print("Введите оператор (+ или *): ");
        String operator = sc.next();
        switch (operator){
            case "+":
                System.out.printf("%d + %d = %d",num1,num2, num1+num2);
                break;
            case "*":
                System.out.printf("%d * %d = %d",num1,num2, num1*num2);
                break;
        }
    }
    //Вводится массив (сначала количество элементов, потом сами элементы).
    // Найдите сумму его элементов с чётными индексами и выведите её.
    // А потом выведите числа, которые суммировались.
    public static void array(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //ищем сумму эллементов с четными позициями
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                sum += arr[i];
                count++;
            }
        }
        System.out.println(sum);
        StringBuilder mySb = new StringBuilder();
        String resarr = "";
//        int[] resarr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) mySb.append(arr[i] + " ");
        }
        System.out.println(mySb);
    }

}