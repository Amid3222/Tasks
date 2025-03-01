public class CounterClass {

    String nameC; // поля
    int counter;

    CounterClass(String nameC) { // конструктор
        this(nameC, 0);
        // this.counter = counter; <- не нужно
    }

    CounterClass(String nameC, int counter) {
        this.counter = counter;
        this.nameC = nameC;


    }


    public int correctUserCount(int newCount) { // метод увеличения числа пользователем
        this.counter += newCount;
        return this.counter;
    }

    public int increaser1() { // ++1

        this.counter += 1;
        return this.counter;
    }

    public int decreaser1() { // --1

        this.counter -= 1;
        return this.counter;
    }

    public void printer() { // принтер
        System.out.printf("%s =  %d \n", this.nameC, this.counter);
    }
}
