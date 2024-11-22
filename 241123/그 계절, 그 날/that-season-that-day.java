import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        if((judgeYoon(Y) && D<=29) || (!judgeYoon(Y) && D<=judgeDayCount(M))){
            System.out.println(judgeWeather(M));
        }

        else{
            System.out.println(-1);
        }
    }

    static boolean judgeYoon(int Y){
        if(Y%4==0 && Y%100!=0 || Y%400==0){
            return true;
        }
        return false;
    }

    static int judgeDayCount(int M){
        switch(M){
            case 2:
                return 28;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            default:
                return -1;
        }
    }

    static String judgeWeather(int M){
        switch(M){
            case 3:
            case 4:
            case 5:
                return "Spring";

            case 6:
            case 7:
            case 8:
                return "Summer";

            case 9:
            case 10:
            case 11:
                return "Fall";

            case 12:
            case 1:
            case 2:
                return "Winter";

            default:
                return "-1";
        }
    }
}