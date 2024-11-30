import java.util.*;

public class Main {

    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(judgeCount(n));
    }

    public static int judgeCount(int n){
        if(n == 1){
            return cnt;
        }

        if(n%2 == 0){
            cnt++;
            return judgeCount(n /= 2);
        }

        else{
            cnt++;
            return judgeCount(n*3+1);
        }
    }
}