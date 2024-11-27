import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long mul = 1;
        for(int i=0; i<3; i++){
            mul *= sc.nextInt();
        }

        System.out.print(sumEachNumber(mul));
    }

    public static long sumEachNumber(long mul){
        if(mul/10 == 0){
            return mul%10;
        }

        return sumEachNumber(mul/10) + (mul%10);
    }
}