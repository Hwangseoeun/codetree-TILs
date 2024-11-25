import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(calculateSum(N));
    }

    public static int calculateSum(int N){
        if(N == 1){
            return 1;
        }

        return calculateSum(N-1)+N;
    }
}