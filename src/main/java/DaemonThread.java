class Animal extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Daemon thread");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().isDaemon());


    }
}

public class DaemonThread {
    public static void main(String[] args) {
      System.out.println("Main thread");
//      Thread.currentThread().setDaemon(true);

        Animal animal = new Animal();
       animal.setDaemon(true);
        animal.start();
        //animal.setDaemon(true);


    }
}
