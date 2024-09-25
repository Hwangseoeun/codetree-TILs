import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        printSquare(N);
    }

    public static void printSquare(int N){
        int k = 1;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(k + " ");
                if(k==9){
                    k = 0;
                }
                k++;
            }
            System.out.println();
        }
    }
}