import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int book = 3000;
        int mask = 1000;

        if(n>=book){
            System.out.print("book");
        }
        else if(n<mask){
            System.out.print("no");
        }
        else{
            System.out.print("mask");
        }
    }
}