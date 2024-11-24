import java.util.*;

public class Main {
    static int aResult = 0;
    static int bResult = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  a = sc.nextInt();
        int b = sc.nextInt();

        calculator(a,b);
        System.out.println(aResult + " " + bResult);
    }

    public static void calculator(int a, int b){
        if(a>b){
            aResult = a * 2;
            bResult = b + 10;
        }
        else{
            aResult = a + 10;
            bResult = b * 2;
        }
    }
}