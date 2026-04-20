package interruotedMethod;

class Car extends Thread{
    public void run(){

//        System.out.println(Thread.interrupted());//true
//        System.out.println(Thread.interrupted());
//        System.out.println(Thread.interrupted());
//        System.out.println(Thread.interrupted());
//
//
//       Thread.interrupted();
//       Thread.interrupted();
        System.out.println(Thread.currentThread().isInterrupted());//false

        try {
            for (int i = 0; i < 5; i++) {

                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class IsIntrupted {
    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.interrupt();

    }
}
