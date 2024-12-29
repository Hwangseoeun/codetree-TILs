import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String A = sc.next();

        int[] day = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};

        int first = 0;
        for(int i=1; i<m1; i++) {
            first += day[i];
        }
        first += d1;

        int second = 0;
        for(int i=1; i<m2; i++) {
            second += day[i];
        }
        second += d2;

        int num = 0;
        switch(A) {
            case "Mon":
                num = 1;
                break;
            case "Tue":
                num = 2;
                break;
            case "Wed":
                num = 3;
                break;
            case "Thu":
                num = 4;
                break;
            case "Fri":
                num = 5;
                break;
            case "Sat":
                num = 6;
                break;
            case "Sun":
                num = 0;
                break;
        }

        int cnt = 0;
        for(int i=1; i<=second-first+1; i++) {
            if(i%7==num) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}