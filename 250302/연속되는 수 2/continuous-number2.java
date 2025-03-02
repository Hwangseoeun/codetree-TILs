import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];
        int cnt = 0;
        int max = 0;

        for(int i=0; i<N; i++) {
            list[i] = sc.nextInt();

            if(i==0 || list[i-1] == list[i]) {
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