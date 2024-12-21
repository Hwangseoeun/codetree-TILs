import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hint hint1 = new Hint(sc.next(), sc.next(), sc.nextInt());

        System.out.println("secret code : " + hint1.secretCode);
        System.out.println("meeting point : " + hint1.meetingPoint);
        System.out.println("time : " + hint1.time);
    }
}

class Hint {
    String secretCode, meetingPoint;
    int time;

    public Hint(String secretCode, String meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}