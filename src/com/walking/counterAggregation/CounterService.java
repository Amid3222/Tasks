package com.walking.counterAggregation;

import java.util.Arrays;

public class CounterService {

    //поля
    private Counter[] counterArr = new Counter[10];


    //методы(добавить к массиву)
    public void addtoArr(Counter counter) {
        int b = 0;
        counterArr[b] = counter;
    }
    //показать массив счетчиков
    public void showCounters() {
        System.out.println(Arrays.toString(counterArr));
    }
    //получить доступ к счетчику по имени
    public Counter getAccesByName(String thename) {

        for (Counter c : counterArr) {
            if (c.getName().equals(thename)) return c;
        }
        return null;

    }
    //изменить значение счетчика
    public void setterViper(Counter c, int x) {
        c.setValue(x);
    }
    //++1 или ++ число
    public void incremerOn(Counter c, int y) {
        int x = c.getValue();
        if (y == 0) {
            c.setValue(++x);
        } else {
            c.setValue(x + y);
        }
    }


}
