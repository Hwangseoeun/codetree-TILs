import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];

        for(int i=0; i<N; i++) {
            num[i] = sc.nextInt();
        }

        int[] sum = new int[N];
        sum[0] = num[0];

        for(int i=1; i<N; i++) {
            if(sum[i-1]+num[i]<=num[i]) {
                sum[i] = num[i];
            }
            else {
                sum[i] = sum[i-1] + num[i];
            }
        }

        int ans = Integer.MIN_VALUE;
        for(int i=0; i<N; i++) {
            ans = Math.max(ans, sum[i]);
        }

        System.out.println(ans);
    }
}