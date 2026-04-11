class Prc extends Thread{
    public void run() {
        try{
            for (int i = 1; i <= 5 ; i++) {

                sleep(1000,100000);
                System.out.println(i);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SleepMethod  {
    public static void main(String[] args) {
        Prc p = new Prc();
        p.start();

    }
}
