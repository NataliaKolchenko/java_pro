package java_pro_06_07062024.src.main.java.org.example.presenter;

import java_pro_06_07062024.src.main.java.org.example.view.View;
import java_pro_06_07062024.src.main.java.org.example.model.Model;

//Создать класс Presenter для управления взаимодействием между моделью и представлением:
//
//Конструктор Presenter(Model m, View v): принимает модель и представление.
//Метод void buttonClick(): получает значения a и b от пользователя, устанавливает их в модель, вычисляет результат и выводит его на экран.
public class Presenter {

    private Model m;
    private View v ;


    public Presenter(Model m, View v) {
        this.m = m;
        this.v = v;
    }

    public void buttonClick() {
        int x = v.getValue("Add X");
        int y = v.getValue("Add Y");

        m.setX(x);
        m.setY(y);

        v.print(m.result(), "Result: ");

    }
}
