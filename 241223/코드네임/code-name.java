import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent[] agents = new Agent[5];

        for(int i=0; i<5; i++) {
            agents[i] = new Agent(sc.next(), sc.nextInt());
        }

        Arrays.sort(agents, Comparator.comparingInt(a -> a.score));

        System.out.println(agents[0].codeName + " " + agents[0].score);
    }
}

class Agent {
    String codeName;
    int score;

    public Agent(String codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}