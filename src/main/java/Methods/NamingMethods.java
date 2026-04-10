package Methods;

class Test extends Thread{
    public void run(){
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Ganga0");
        System.out.println(Thread.currentThread().getName());


    }
}
public class NamingMethods {
    public static void main(String[] args) {

        Test t = new Test();
        t.start();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Ganga");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread());

        Test t2 = new Test();
        t2.start();
        Thread.currentThread().setName("tdit");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());

//        System.out.println(10/0);

    }
}
