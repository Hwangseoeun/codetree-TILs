import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Score[] people = new Score[n];
        for(int i=0; i<n; i++) {
            people[i] = new Score(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(people, Comparator.comparingInt(a -> a.first + a.second + a.third));

        for(int i=0; i<n; i++) {
            System.out.println(people[i].name + " " + people[i].first + " " + people[i].second + " " + people[i].third);
        }
    }
}

class Score {
    String name;
    int first, second, third;

    public Score(String name, int first, int second, int third) {
        this.name = name;
        this.first = first;
        this.second = second;
        this.third = third;
    }
}