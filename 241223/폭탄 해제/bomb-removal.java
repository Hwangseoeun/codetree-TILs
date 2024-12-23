import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bomb bomb1 = new Bomb(sc.next(), sc.next(), sc.nextInt());

        System.out.println("code : " + bomb1.code);
        System.out.println("color : " + bomb1.color);
        System.out.println("second : " + bomb1.second);
    }
}

class Bomb {
    String code, color;
    int second;

    public Bomb(String code, String color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}