import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];
        int cnt = 0;
        int[] cntList = new int[N];

        for(int i=0; i<N; i++) {
            list[i] = sc.nextInt();

            if(i==0 || list[i-1] == list[i]) {
                cnt++;
            }
            else {
                cntList[i] = cnt;
                cnt = 1;
            }
        }

        int max = 0;
        for(int i : cntList) {
            max = Math.max(max, i);
        }

        System.out.println(max);
    }
}