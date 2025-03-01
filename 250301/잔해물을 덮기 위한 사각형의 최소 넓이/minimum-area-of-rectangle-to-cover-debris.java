import java.util.*;

public class Main {

    public static final int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] square = new int[2000][2000];

        int x1 = sc.nextInt()+OFFSET;
        int y1 = sc.nextInt()+OFFSET;
        int x2 = sc.nextInt()+OFFSET;
        int y2 = sc.nextInt()+OFFSET;

        for(int j=x1; j<x2; j++) {
            for(int k=y1; k<y2; k++) {
                square[j][k] = 1;
            }
        }

        x1 = sc.nextInt()+OFFSET;
        y1 = sc.nextInt()+OFFSET;
        x2 = sc.nextInt()+OFFSET;
        y2 = sc.nextInt()+OFFSET;

        for(int j=x1; j<x2; j++) {
            for(int k=y1; k<y2; k++) {
                square[j][k] = 0;
            }
        }

        int minX = 2000, minY = 2000;
        int maxX = 0, maxY = 0;

        for(int i=0; i<2000; i++) {
            for(int j=0; j<2000; j++) {
                if(square[i][j]==1) {
                    if(i<=minX) {
                        minX = i;
                    }
                    if(i>=maxX) {
                        maxX = i;
                    }
                    if(j<=minY) {
                        minY = j;
                    }
                    if(j>=maxY){
                        maxY = j;
                    }
                }
            }
        }

        if((maxX-minX+1)*(maxY-minY+1)>=1999*1999) {
            System.out.println("0");
        }
        else {
            System.out.println((maxX-minX+1)*(maxY-minY+1));
        }
    }
}