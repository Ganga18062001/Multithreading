package yieldMethod;
class A extends Thread{
    public void run(){
       Thread.yield();

        for (int i = 0; i <=5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);

        }
    }
}
public class Main {
    public static void main(String[] args) {

        A a = new A();
        a.start();
//        Thread.yield();


        for (int i = 1; i <= 5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);


        }

    }
}
