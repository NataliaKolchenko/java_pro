package WorkWithJSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

//Создайте JSON файл с информацией о погоде (температура, влажность, скорость ветра) и напишите программу для его чтения.
public class ex1_CreateAnsReadJSONFile {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper jsonMapper = new ObjectMapper();
        String path = "WEATHER.json";
//        File file = new File(path);

        Weather weatherBerlin = new Weather("Berlin", 22, 59, 7.2);

        String json = jsonMapper.writeValueAsString(weatherBerlin);
//        System.out.println(json);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(json);
            System.out.println("Файл успешно записан.");
        }  catch (IOException e) {
            System.err.println("Error in writing progress" + e.getMessage());
        }

    }
}

class Weather {
    private String city;
    private double temperature;
    private int humidity;
    private double windSpeed;

    public Weather(String city, double temperature, int humid, double windSpeed) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humid;
        this.windSpeed = windSpeed;
    }

    public String getCity() {
        return city;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }
}