import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.print(judgeLeafYear(year));
    }

    public static boolean judgeLeafYear(int year){
        if(year%4==0){
            if(year%100==0 && year%400!=0){
                return false;
            }
            return true;
        }
        return false;
    }
}