import java.util.*;

public class Main {

    static int a[];
    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.print(findMax(n));
    }

    public static int findMax(int n){
        if(n == 0){
            return a[0];
        }

        if(findMax(n-1)<a[n-1]){
            max = a[n-1];
        }

        return max;
    }
}