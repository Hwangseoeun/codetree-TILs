import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Info[] infos = new Info[n];
        for(int i=0; i<n; i++){
            infos[i] = new Info(sc.next(), sc.next(), sc.next());
        }

        Arrays.sort(infos, Comparator.comparing(a -> a.name));

        System.out.println("name " + infos[n-1].name);
        System.out.println("addr " + infos[n-1].streetNumber);
        System.out.println("city " + infos[n-1].region);
    }
}

class Info {
    String name, streetNumber, region;

    public Info(String name, String streetNumber, String region) {
        this.name = name;
        this.streetNumber = streetNumber;
        this.region = region;
    }
}