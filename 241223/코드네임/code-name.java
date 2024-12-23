import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent[] agents = new Agent[5];

        for(int i=0; i<5; i++) {
            agents[i] = new Agent(sc.next(), sc.nextInt());
        }

        int min = 100;
        for(Agent a : agents) {
            if(a.score < min){
                min = a.score;
                continue;
            }
        }

        for(Agent a : agents) {
            if(a.score == min){
                System.out.println(a.codeName + " " + a.score);
                break;
            }
        }
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