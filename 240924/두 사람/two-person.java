import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aAge = sc.nextInt();
        String aGender = sc.next();
        int bAge = sc.nextInt();
        String bGender = sc.next();

        if(aAge>=19 && aGender.equals("M")){
            System.out.print(1);
        }
        else if(bAge>=19 && bGender.equals("M")){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}