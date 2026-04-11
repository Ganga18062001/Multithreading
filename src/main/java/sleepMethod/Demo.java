package sleepMethod;

public class Demo extends Thread {
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i+" : "+Thread.currentThread().getName());
                Thread.sleep(1000);

            }
        }catch (Exception e){
            e.printStackTrace();

        }
    }
    public static void main(String[] args) {

        Demo demo1 = new Demo();
        demo1.start();

        Demo demo2 = new Demo();
        demo2.start();

    }
}
