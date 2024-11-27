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

        System.out.print(findMax(n-1));
    }

    public static int findMax(int idx){
        if(idx == 1){
            return a[0];
        }

        findMax(idx-1);

        if(a[idx-1]>a[idx]){
            max = a[idx-1];
        }

        return max;
    }
}