import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] num = new int[N];
        int max = 0, cnt = 0;

        for(int i=0; i<N; i++) {
            num[i] = sc.nextInt();

            if(i==0 || (num[i-1]<0 && num[i]>0) || (num[i-1]>0 && num[i]<0)) {
                cnt = 1;
            }
            else {
                cnt++;
                max = Math.max(max, cnt);
            }
        }

        System.out.println(max);
    }
}