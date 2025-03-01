public class Main {

    public static void main(String[] args) {

        CounterClass even = new CounterClass("Счетчик Четных"); // создаем объедки
        CounterClass noEven = new CounterClass("Счетчик Нечетных");

        for (int i = 1; i <= 100; i++) { // цикл перебора значений от нуля до 100
            if (i % 2 == 0) {
                even.increaser1();
            } else noEven.increaser1();
        }

        even.printer(); // вывод в консось
        noEven.printer();
    }
}
