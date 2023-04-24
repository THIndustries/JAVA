import java.util.Scanner;
public class array2d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][];
        int[] arr0 = {1,31,25,17,35,15,16,91,42,3,81};
        arr[0] = arr0;
        arr[1] = new int[]{34, 4567, 344, 734, 6};
        arr[2] = new int[]{1};
        arr[3] = new int[]{34, 5, 42, 356, 4567, 344, 734, 6};
        arr[4] = new int[]{34, 5};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }


}
