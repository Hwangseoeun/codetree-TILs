import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(findFibonacciNumber(N));
    }

    public static int findFibonacciNumber(int N){
        if(N == 1){
            return 1;
        }
        if(N == 2){
            return 1;
        }

        return findFibonacciNumber(N-2) + findFibonacciNumber(N-1);
    }
}