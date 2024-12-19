import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        char[] list = word.toCharArray();
        Arrays.sort(list);

        String sortWord = new String(list);

        System.out.print(sortWord);
    }
}