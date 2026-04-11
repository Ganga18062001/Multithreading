package joinMethod;

public class Test1 extends Thread{

    static Thread mainThread;

    public void run(){

        try{
            mainThread.join();
            for (int i = 0; i < 5; i++) {

                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args)  {

          mainThread = Thread.currentThread();



        Test1 t1 = new Test1();
        t1.start();


        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
