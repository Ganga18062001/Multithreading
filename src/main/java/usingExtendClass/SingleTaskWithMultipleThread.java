package usingExtendClass;

class A extends Thread{
    public void run(){
        System.out.println("Task A");
    }
}
public class SingleTaskWithMultipleThread {
    public static void main(String[] args) {
        A a = new A();
        a.start();

        A b = new A();
        b.start();
    }
}
