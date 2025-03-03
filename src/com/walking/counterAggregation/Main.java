package com.walking.counterAggregation;

public class Main {

    private static void viewAllbase(CounterService c) {
        // <Название счетчика>: <Значение счетчика>
        String str = c.showCounters();
        String[] arr = str.split("; ");
        for (String b : arr) {
            System.out.printf("%s: %d\n", b, c.showValue(c.getAccesByName(b)));
        }
    }

    public static void main(String[] args) {
        CounterService service = new CounterService();

        Counter gazCounter = new Counter("Газ_Счетчик", 55 , "м. куб");
        Counter waterCounter = new Counter("Вода_Счетчик", 856, "литр.");
        Counter electroCounter = new Counter("Эл_Счетчик",5756 , "ватт");

        service.addtoArr(gazCounter, waterCounter, electroCounter);
        service.showCounters();
        System.out.println(gazCounter.getValue());
        Counter c = service.getAccesByName("Газ_Счетчик");
        service.setterViper(c, 112);
        System.out.println(gazCounter.getValue());

        Main.viewAllbase(service);

    }
}