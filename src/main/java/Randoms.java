import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;
    private Random random = new Random();

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() { // возвращаем объект реализующий интерфейс Iterator;

            @Override
            public boolean hasNext() { // С помощью метода hasNext() можно узнать, есть ли следующий элемент, и не достигнут ли конец коллекции;
                return true;
            }

            @Override
            public Integer next() { // с помощью вызова метода next() можно получить следующий элемент;
                int difference = max - min;
                return random.nextInt(difference + 1) + min;
            }
        };
    }
}