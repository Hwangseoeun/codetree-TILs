import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = n;

        int cnt = 0;
        for(int i=1; i<=5000; i++){
            if(num <= 1){
                System.out.print(cnt);
                break;
            }
            num = num/i;
            cnt++;
        }
    }
}