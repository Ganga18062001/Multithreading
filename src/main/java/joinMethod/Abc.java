package joinMethod;

public class Abc extends Thread {

    public void run(){
        try{

            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws InterruptedException{
//Thread.currentThread().join();
        Abc abc = new Abc();
        abc.start();
        abc.join();

        try{
            for (int i = 1; i <= 5 ; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        Thread.currentThread().join();

        Abc a = new Abc();
        a.start();
//        a.start();

    }
}
