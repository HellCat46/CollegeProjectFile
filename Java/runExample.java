public class runExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Class2());
        thread.start();
        for (int i=10; i< 20;i++){
            Thread.sleep(2000);
            System.out.println(i);
        }
    }
}

class Class2 implements Runnable{

    @Override
    public void run() {
        for (int i=0; i< 10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
            System.out.println(i);
        }
    }
}
