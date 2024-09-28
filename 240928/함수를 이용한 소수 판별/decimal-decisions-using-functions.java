import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(sumPrimeNumber(a,b));
    }

    public static int sumPrimeNumber(int a, int b){
        int sum = 0;
        
        for(int i=a; i<=b; i++){
            if(isPrime(i)){
                sum += i;
            }
            else{
                continue;
            }
        }

        return sum;
    }

    public static boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
}