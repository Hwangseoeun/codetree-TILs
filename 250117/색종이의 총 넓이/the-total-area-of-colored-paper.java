import java.util.*;

public class Main {

    public static final int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] section = new int[200][200];
        for(int i=0; i<N; i++) {
            int x = sc.nextInt() + OFFSET;
            int y = sc.nextInt() + OFFSET;

            for(int j=x; j<x+8; j++) {
                for(int k=y; k<y+8; k++) {
                    section[j][k] += 1;
                }
            }
        }

        int cnt = 0;
        for(int j=0; j<200; j++) {
            for(int k=0; k<200; k++) {
                if(section[j][k] >= 1) {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}