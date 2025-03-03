package com.walking.counterAggregation;

public class Main {
    public static void main(String[] args) {
        CounterService service = new CounterService();
        Counter Gaz = new Counter("Газ", "м. куб");

        service.addtoArr(Gaz);
        service.showCounters();


    }
}