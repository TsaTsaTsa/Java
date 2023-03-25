package lena;

import lena.threads.Consumer;
import lena.threads.Generator;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        Consumer consumer = new Consumer();

        Thread generator_thread = new Thread(generator);
        Thread consumer_thread = new Thread(consumer);

        generator_thread.start();
        consumer_thread.start();
    }
}
