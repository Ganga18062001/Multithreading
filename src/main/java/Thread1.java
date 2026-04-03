class A extends Thread{

    public void run(){
        System.out.println("Run method");
    }
    public void run(int a){
        System.out.println("Run method"+a);
    }

}


public class Thread1 {
    public static void main(String[] args) {

        A a = new A();
        a.start();
        a.run(1);

//        a.start();

    }
}
