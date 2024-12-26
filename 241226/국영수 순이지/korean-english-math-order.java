import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Grade[] person = new Grade[n];
        for(int i=0; i<n; i++) {
            person[i] = new Grade(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(person, (a1, a2) -> {
            if (a2.korean != a1.korean) {
                return a2.korean - a1.korean;
            } else if (a2.english != a1.english) {
                return a2.english - a1.english;
            } else {
                return a2.math - a1.math;
            }
        });

        for(int i=0; i<n; i++) {
            System.out.println(person[i].name + " " + person[i].korean + " " + person[i].english + " " + person[i].math);
        }
    }
}

class Grade {
    String name;
    int korean, english, math;

    public Grade(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}