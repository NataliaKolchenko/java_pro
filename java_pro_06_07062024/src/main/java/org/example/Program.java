package org.example;

import org.example.infractructure.CalcApp;
import org.example.model.Model;
import org.example.model.MultipleModel;
import org.example.presenter.Presenter;
import org.example.view.View;
import org.example.view.ViewTerminal;

//Создать класс Program с методом main, который:
//
//Создаёт экземпляры SumModel и View.
//Создаёт экземпляр Presenter.
//Вызывает метод buttonClick() несколько раз для демонстрации работы системы.
public class Program {


    public static void main(String[] args) {
        CalcApp.run();
    }
}
