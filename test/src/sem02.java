///*Дана строка, в которой через пробел перечислены цифры.
//На следующей строке вводится цифра.
//Определите индексы первого и последнего её вхождения.*/
//package lesson2;
//
//public class Task {
//
//    public static void main(String[] args) {
//        String str="4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
//        String num="4";
//
//        System.out.println(str.indexOf(num));
//        System.out.println(str.lastIndexOf(num));
//    }
//}
//
//    String text = "FIFA will never regret it";
//String[] words = text.split(" ");
//for(String word : words){    System.out.println(word);}
//
//
///*Формат входных данных:
//На первой строке вводится любимая буква Маши,
// на второй - Олега. Затем вводится строка, в которой перечислены слова,
//  которые написаны в газете.
//Формат выходных данных:
//На первой строчке выведите, сколько слов выписала Маша,
//а на второй - сколько слов выписал Олег.*/
///*Sample Input:
//а
//в
//Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
//Sample Output:
//7
//5
// */
//        package lesson2;
//
//public class Task2 {
//    public static void main(String[] args) {
//        String str="Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
//        String[] words=str.split(" ");
//        char _letter1='а',_letter2='в';
//        int count1=0,count2=0;
//        for(int i=0;i<words.length;i++){
//            if(words[i].indexOf(_letter1)!=-1)
//                count1++;
//        }
//        for(int i=0;i<words.length;i++){
//            if(words[i].indexOf(_letter2)!=-1)
//                count2++;
//        }
//        System.out.println(count1);
//        System.out.println(count2);
//    }
//
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        String ip = "188.333";
//            String[] ipe = ip.split("\\.");
//            System.out.println(ipe[0]);
//            int q = Integer.parseInt(ipe[0]);
//            System.out.println(q + 10);
//            }
//        }
//
//package lesson2;
//
//public class Task3 {
//    public static void main(String[] args) {
//        String ip="300.00.255.255";
//        String[] nums=ip.split("\\.");
//
//        if(nums.length!=4)return;
//        for(String s:nums){
//            int num=Integer.parseInt(s);
//            if(num<0||num>255){
//                System.out.println("неправильный ip");
//                return;
//            }
//        }
//        System.out.println("правильный ip");
//    }
//}