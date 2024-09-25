import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        findMultiple(n,m);
    }

    public static void findMultiple(int n, int m){
        int max = 0;
        for(int i=1; i<=100; i++){
            if(n%i==0 && m%i==0){
                max = i;
            }
        }

        int multiple = (n*m)/max;

        System.out.print(multiple);
    }
}