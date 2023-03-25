package lena.threads;

public class Generator implements Runnable {
    private static int data = 0;

    public void giveData() throws InterruptedException {
        synchronized (Buffer.buffer) {
            if (Buffer.buffer.size() == Buffer.MAX_SIZE) {
                System.out.println("Буфер заполнен\n");

                Buffer.buffer.wait();
            }

            Buffer.buffer.add(++data);
            System.out.printf("Производитель  добавил " + data + '\n');

            Buffer.buffer.notifyAll();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                giveData();
            } catch (InterruptedException exception) {
                System.out.println("[ERROR!]: " + exception.getMessage());
            }
        }
    }
}