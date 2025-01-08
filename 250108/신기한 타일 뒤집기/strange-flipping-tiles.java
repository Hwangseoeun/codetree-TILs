import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] tile = new String[200000];
        int cur = 100000, whiteTileCount = 0, blackTileCount = 0;

        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            String dir = sc.next();

            if(dir.equals("L")) {
                for(int j=cur; j>cur-num; j--) {
                    tile[j] = "WHITE";
                }

                cur -= num-1;
            }

            else {
                for(int j=cur; j<cur+num; j++) {
                    tile[j] = "BLACK";
                }

                cur += num-1;
            }
        }

        for(int i=0; i<200000; i++) {
            if(tile[i] != null && tile[i].equals("WHITE")) {
                whiteTileCount++;
            }

            if(tile[i] != null && tile[i].equals("BLACK")) {
                blackTileCount++;
            }
        }

        System.out.print(whiteTileCount + " " + blackTileCount);
    }
}