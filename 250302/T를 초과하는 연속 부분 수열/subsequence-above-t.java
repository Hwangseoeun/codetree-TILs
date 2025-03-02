import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();

        int[] num = new int[N];
        int cnt = 0, max = 0;

        for(int i=0; i<N; i++) {
            num[i] = sc.nextInt();

            if(num[i]>T) {
                cnt++;
            }
            else {
                cnt = 0;
            }

            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}