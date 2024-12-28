import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Dot[] dots = new Dot[N];
        for(int i=0; i<N; i++) {
            dots[i] = new Dot(sc.nextInt(), sc.nextInt(), i+1);
        }

        Arrays.sort(dots, (a1, a2) -> {
            if(Math.abs(a1.x)+Math.abs(a1.y) != Math.abs(a2.x)+Math.abs(a2.y)){
                return (Math.abs(a1.x)+Math.abs(a1.y)) - (Math.abs(a2.x)+Math.abs(a2.y));
            }
            else{
                return a1.number - a2.number;
            }
        });

        for(int i=0; i<N; i++) {
            System.out.println(dots[i].number);
        }
    }
}

class Dot {
    int x,y,number;

    public Dot(int x, int y, int number) {
        this.x = x;
        this.y = y;
        this.number = number;
    }
}