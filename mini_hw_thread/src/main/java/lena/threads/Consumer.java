package lena.threads;

public class Consumer implements Runnable {
    public void takeData() throws InterruptedException {
        synchronized (Buffer.buffer) {
            if (Buffer.buffer.isEmpty()) {
                System.out.println("Буфер пуст.\n");

                Buffer.buffer.wait();
            }

            int cur_data = Buffer.buffer.remove();
            System.out.printf("Потребитель взял " + cur_data + '\n');

            Buffer.buffer.notifyAll();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                takeData();
            } catch (InterruptedException exception) {
                System.out.println("[ERROR!]: " + exception.getMessage());
            }
        }
    }
}
