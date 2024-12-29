import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] month = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dayOfWeek = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int first = 0;
        for(int i=1; i<m1; i++) {
            first += month[i];
        }
        first += d1;

        int second = 0;
        for(int i=1; i<m2; i++) {
            second += month[i];
        }
        second += d2;

        if(first<second) {
            switch((second-first)%7) {
                case 0:
                    System.out.println(dayOfWeek[1]);
                    break;
                case 1:
                    System.out.println(dayOfWeek[2]);
                    break;
                case 2:
                    System.out.println(dayOfWeek[3]);
                    break;
                case 3:
                    System.out.println(dayOfWeek[4]);
                  break;
                case 4:
                  System.out.println(dayOfWeek[5]);
                  break;
                case 5:
                    System.out.println(dayOfWeek[6]);
                    break;
                case 6:
                    System.out.println(dayOfWeek[0]);
                    break;
            }
        }
        else {
            switch((first-second)%7) {
                case 0:
                    System.out.println(dayOfWeek[1]);
                    break;
                case 1:
                    System.out.println(dayOfWeek[0]);
                    break;
                case 2:
                    System.out.println(dayOfWeek[6]);
                    break;
                case 3:
                    System.out.println(dayOfWeek[5]);
                  break;
                case 4:
                  System.out.println(dayOfWeek[4]);
                  break;
                case 5:
                    System.out.println(dayOfWeek[3]);
                    break;
                case 6:
                    System.out.println(dayOfWeek[2]);
                    break;
            }
        }
    }
}