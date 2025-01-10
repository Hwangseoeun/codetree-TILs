import java.util.*;

public class Main {

    public static final int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] section = new int[2000][2000];

        for(int i=0; i<3; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for(int x=x1; x<x2; x++) {
                for(int y=y1; y<y2; y++) {
                    if(i == 2) {
                        section[x][y] = 0;
                    }
                    else {
                        section[x][y] += 1;
                    }
                }
            }
        }

        int cnt = 0;

        for(int x=0; x<2000; x++) {
            for(int y=0; y<2000; y++) {
                if(section[x][y] == 1) {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}