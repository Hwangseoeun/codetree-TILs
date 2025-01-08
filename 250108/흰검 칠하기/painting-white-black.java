import java.util.*;

public class Main {

    public static final String W = "WHITE";
    public static final String B = "BLACK";
    public static final String G = "GRAY";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] blackCountList = new int[200000];
        int[] whiteCountList = new int[200000];
        String[] tileList = new String[200000];
        int cur = 100000, whiteTileCount = 0, blackTileCount = 0, grayTileCount = 0;

        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            String dir = sc.next();

            if(dir.equals("R")) {
                for(int j=cur; j<cur+num; j++) {
                    blackCountList[j] += 1;
                    tileList[j] = B;
                }

                cur += num-1;
            }

            else {
                for(int j=cur; j>cur-num; j--) {
                    whiteCountList[j] += 1;
                    tileList[j] = W;
                }

                cur -= num-1;
            }
        }

        for(int i=0; i<200000; i++) {
            if(blackCountList[i] >= 2 && whiteCountList[i] >= 2) {
                tileList[i] = G;
            }

            if(tileList[i] != null && tileList[i].equals("WHITE")) {
                whiteTileCount++;
            }

            if(tileList[i] != null && tileList[i].equals("BLACK")) {
                blackTileCount++;
            }

            if(tileList[i] != null && tileList[i].equals("GRAY")) {
                grayTileCount++;
            }
        }

        System.out.print(whiteTileCount + " " + blackTileCount + " " + grayTileCount);
    }
}