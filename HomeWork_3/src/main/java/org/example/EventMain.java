package org.example;

import com.sun.tools.javac.Main;

import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class EventMain {

    static Logger LOGGER = Logger.getLogger(Main.class.getName());
    static {
        try  {
            FileHandler ins = new FileHandler("/Users/sam-mac/log.log");
            LOGGER.addHandler(ins);
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {

            LOGGER.info("Создаем объект класса Repository");
            Repository repo = new Repository();

            LOGGER.info("Создаем объект класса LocalDateTime, который будет частью объекта Event (1го мероприятия)");
            LocalDateTime firstDate = LocalDateTime.of(2025, Month.MAY, 15, 11, 30);

            LOGGER.info("Создаем объект класса Host, который будет частью объекта Event (1го мероприятия)");
            Host firstHost = new Host("James Bond", "bond@jamesbond.com", "agent007", "me.jpg");

            LOGGER.info("Создаем объект класса Event (1го мероприятия)");
            Event firstEvent = new Event("B-Day party", firstDate, "Party of my nice", "BDay", false, firstHost);

            LOGGER.info("Добавляем 1е мероприятие в List");
            repo.createEvent(firstEvent);

            LOGGER.info("Создаем объект класса LocalDateTime, который будет частью объекта Event (2го мероприятия)");
            LocalDateTime secondDate = LocalDateTime.of(2024, Month.JULY, 1, 9, 00);

            LOGGER.info("Создаем объект класса Host, который будет частью объекта Event (2го мероприятия)");
            Host secondHost = new Host("Joy Richard", "joy@rechard.com", "itSme98", "me.jpg");

            LOGGER.info("Создаем объект класса Event (2го мероприятия)");
            Event secondEvent = new Event("B-Day party", secondDate, "Party", "BDay", true, secondHost);

            LOGGER.info("Добавляем 2е мероприятие в List");
            repo.createEvent(secondEvent);

            LOGGER.info("Выводим информацию о всех мероприятий в консоль");
            repo.printEvents();

            System.out.println();

            LOGGER.info("Получаем данные для 2го мероприятия по id");
            repo.getEventById(secondEvent.getId());

            LOGGER.info("Выводим информацию о 2м мероприятии в консоль");
            repo.printEvents(repo.getEventById(secondEvent.getId()));

            System.out.println();

            LOGGER.info("Удаляем 2е мероприятие из общего списка");
            repo.deleteEvent(secondEvent.getId());
            LOGGER.info("Выводим информацию о всех мероприятий в консоль");
            repo.printEvents();

            System.out.println();

            LOGGER.info("Создаем объект класса LocalDateTime, который будет частью объекта Event (3го мероприятия)");
            LocalDateTime thirdDate = LocalDateTime.of(2024, Month.OCTOBER, 10, 18, 50);

            LOGGER.info("Создаем объект класса Host, который будет частью объекта Event (3го мероприятия)");
            Host thirdHost = new Host("Jessica K.", "J@K.com", "missWorld1978", "me.jpg");

            LOGGER.info("Создаем объект класса Event (3го мероприятия)");
            Event thirdEvent = new Event("bachelorette party", thirdDate, "Party", "BP", false, thirdHost);

            LOGGER.info("Добавляем 3е мероприятие в List");
            repo.createEvent(thirdEvent);
            LOGGER.info("Выводим информацию о всех мероприятий в консоль");
            repo.printEvents();

            System.out.println();
            LOGGER.info("Изменяем заголовок 3го мероприятия");
            thirdEvent.setTitle("test");

            LOGGER.info("Обновляем информацию о 3м мероприятии в List'е");
            repo.updateEvent(thirdEvent);

            LOGGER.info("Выводим информацию о всех мероприятий в консоль");
            repo.printEvents();

        }catch (Exception e) {
            LOGGER.log(Level.WARNING,"что-то пошло не так" , e);
        }

    }
}