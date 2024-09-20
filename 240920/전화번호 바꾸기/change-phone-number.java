import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text = sc.next().split("-");

        String head = text[0];
        String body = text[1];
        String tail = text[2];

        System.out.print(head+"-"+tail+"-"+body);
    }
}