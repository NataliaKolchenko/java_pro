package org.example.infractructure;

import org.example.model.Model;
import org.example.model.MultipleModel;
import org.example.presenter.Presenter;
import org.example.view.View;
import org.example.view.ViewTerminal;

public class CalcApp {
    public static void run () {
        Model sm = new MultipleModel();
        View v = new ViewTerminal();
        Presenter pr = new Presenter(sm, v);

        pr.buttonClick();
    }
}
