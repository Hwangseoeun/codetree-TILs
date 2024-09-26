import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(findMin(a,b,c));
    }

    public static int findMin(int a, int b, int c){
        int[] list = {a, b, c};
        int min = 0;

        for(int i:list){
            min = Math.min(i, min);
        }

        return min;
    }
}