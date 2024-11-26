import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(findCount(N));
    }

    public static int findCount(int N){
        if(N==1){
            return 0;
        }

        if(N%2==0){
            return findCount(N/2)+1;
        }
        else{
            return findCount(N/3)+1;
        }
    }
}