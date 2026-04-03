package usingExtendClass;

class Thread1 extends Thread{
    public void run(){
        System.out.println("Task 1");
    }
}
public class SingleThraedWithSingleTask {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        t1.start();

    }
}
