
public class PriorityPractice extends Thread {
    public void run(){
        System.out.println("child  thread");

        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Thread.currentThread().setPriority(MAX_PRIORITY);

       System.out.println(Thread.currentThread().getPriority());
//       Thread.currentThread().setPriority(10);
        PriorityPractice p = new PriorityPractice();
//        p.setPriority(8);
        p.start();
//        System.out.println(Thread.currentThread().getPriority());


    }
}
