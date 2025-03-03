package com.walking.counterAggregation;

import java.util.Arrays;

public class CounterService {

    //поля
    private Counter[] counterArr;


    //методы(добавить к массиву)
    public void addtoArr(Counter... counters) {
        counterArr = counters;
    }

    //показать массив счетчиков
    public String showCounters() {
        String s = "";
        for (Counter b : counterArr) {
            s += b.getName() + "; ";
        }
        System.out.println(s);
        return s;
    }

    //получить доступ к счетчику по имени
    public Counter getAccesByName(String thename) {

        for (Counter c : counterArr) {
            if (c.getName().equals(thename)) return c;
        }
        return null;

    }

    public int showValue(Counter c){
        return c.getValue();
    }

    //изменить значение счетчика
    public void setterViper(Counter c, int x) {
        c.setValue(x);
    }

    //++1 или ++ число
    public void incremerOn(Counter c, int y) {
        int x = c.getValue();
        if (y == 0) c.setValue(++x);
        else c.setValue(x + y);

    }


}
