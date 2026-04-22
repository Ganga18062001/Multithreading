package synchronization;

class TotalEarnning extends Thread{

    int total = 0;
    public void run(){
        synchronized (this){
            for (int i = 0; i < 10; i++) {

                total = total + 100;

            }this.notify();
        }
    }
}
public class CooperationSynchronization {
    public static void main(String[] args) throws InterruptedException {

        TotalEarnning tr = new TotalEarnning();
        tr.start();
//        tr.join();

        synchronized (tr){
            tr.wait();
        }
        System.out.println("Total earnning is : "+tr.total);

    }
}
