import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int n;

        // 입력
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int a;
            a = sc.nextInt();
            if(a % 2 == 1 && a % 3 == 0)
                System.out.println(a);
        }
    }
}