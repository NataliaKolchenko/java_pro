package org.example.model;
//оздать класс SumModel, который наследует CalcModel и реализует метод result() для выполнения операции сложения:
//
//int result(): возвращает сумму x и y.
//Реализовать методы setX(int value) и setY(int value) для установки значений x и y.

import org.example.model.CalcModel;

public class SumModel extends CalcModel {

    @Override
    public int result() {
        return x + y;
    }


}
