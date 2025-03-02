import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] num = new int[N];
        int max = 0, cnt = 0;

        for(int i=0; i<N; i++) {
            num[i] = sc.nextInt();

            if(i==0 || (num[i-1]<0 && num[i]<0) || (num[i-1]>0 && num[i]>0)) {
                cnt++;
                max = Math.max(max, cnt);
            }
            else {
                cnt = 1;
            }
        }

        System.out.println(max);
    }
}