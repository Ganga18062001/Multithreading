package runnableInterface;

class Test implements Runnable{

    public void run(){
        System.out.println("Thread task");
    }

}
public class Runnable1 {
    public static void main(String[] args) {

        Test t = new Test();
        Thread th = new Thread(t);
        th.start();

    }
}
