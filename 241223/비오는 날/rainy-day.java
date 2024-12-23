import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        WeatherData[] datas = new WeatherData[n];
        for(int i=0; i<n; i++){
            datas[i] = new WeatherData(sc.next(), sc.next(), sc.next());
        }

        Arrays.sort(datas, Comparator.comparing(a -> a.date));

        for(WeatherData data : datas) {
            if(data.weather.equals("Rain")) {
                System.out.print(data.date + " " + data.dayOfWeek + " " + data.weather);
                break;
            }
        }
    }
}

class WeatherData {
    String date, dayOfWeek, weather;

    public WeatherData(String date, String dayOfWeek, String weather) {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        this.weather = weather;
    }
}