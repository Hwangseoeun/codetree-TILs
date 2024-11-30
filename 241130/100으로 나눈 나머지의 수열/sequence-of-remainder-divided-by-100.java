import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(findNum(N));
    }

    public static int findNum(int N){
        if(N == 1){
            return 2;
        }

        if(N == 2){
            return 4;
        }

        return findNum(N-2)*findNum(N-1)%100;
    }
}