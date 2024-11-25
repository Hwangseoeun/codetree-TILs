import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(calculateSumSquare(N));
    }

    public static int calculateSumSquare(int N){
        if(N<10){
            return N*N;
        }

        return calculateSumSquare(N/10)+(N%10)*(N%10);
    }
}