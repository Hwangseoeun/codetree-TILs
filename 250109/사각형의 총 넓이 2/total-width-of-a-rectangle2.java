import java.util.*;

public class Main {

    public static final int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] section = new int[200][200];

        for(int i=0; i<N; i++) {

            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for(int j=x1; j<x2; j++) {
                for(int k=y1; k<y2; k++) {
                    section[j][k] += 1;
                }
            }
        }

        int cnt = 0;

        for(int i=0; i<200; i++) {
            for(int j=0; j<200; j++) {
                if(section[i][j] >= 1) {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}