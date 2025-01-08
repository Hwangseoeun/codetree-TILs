import java.util.*;

public class Main {

    public static final int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] list = new int[2000];
        int current = 1000, cnt = 0;

        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            String dir = sc.next();

            if(dir.equals("R")) {
                for(int j=current; j<current+num; j++) {
                    list[j] += 1;
                }
                current += num;
            }
            else {
                for(int j=current-1; j>=current-num; j--) {
                    list[j] += 1;
                }
                current -= num;
            }
        }

        for(int i=0; i<2000; i++) {
            if(list[i] >= 2) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}