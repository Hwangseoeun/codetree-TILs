public class Main {
    public static void main(String[] args) {
        float a = 5.26f;
        float b = 8.27f;

        String result = String.format("%.3f", a*b);

        System.out.print(result);
    }
}