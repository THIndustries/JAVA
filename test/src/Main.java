import java.util.Scanner;
class program{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int dist = t * x;
        int t2 = dist / y;
        System.out.println(t + t2);
    }
}