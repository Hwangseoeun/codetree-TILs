import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(result(a,b));
    }

    public static int result(int a, int b){
        int num = 1;
        for(int i=0; i<b; i++){
            num *= a;
        }

        return num;
    }
}