import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String dir;
        int dis;
        int dx = 0, dy = 0;

        for(int i=0; i<N; i++){
            dir = sc.next();
            dis = sc.nextInt();

            if(dir.equals("W")){
                dx -= dis;
            }
            if(dir.equals("S")){
                dy -= dis;
            }
            if(dir.equals("N")){
                dy += dis;
            }
            if(dir.equals("E")){
                dx += dis;
            }
        }

        System.out.print(dx + " " + dy);
    }
}