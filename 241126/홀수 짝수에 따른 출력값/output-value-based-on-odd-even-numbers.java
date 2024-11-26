import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(sumOddOrEven(N));
    }

    public static int sumOddOrEven(int N){
        if(N == 1){
            return 1;
        }
        if(N == 2){
            return 2;
        }

        return sumOddOrEven(N-2) + N;
    }
}