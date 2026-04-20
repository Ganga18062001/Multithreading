package synchronization;
class A{
    static int to_seat = 20;
   static synchronized void book(int seat){

        if(to_seat>=seat){
            System.out.println(seat +" Book successfully");
            to_seat = to_seat - seat;
            System.out.println(to_seat +" left seat");


        }else{
            System.out.println("Seat can not be booked");
            System.out.println(to_seat+" seat Reaming ");
        }

    }
}

class B extends Thread{
    A a;
    int seat;
    B(A a,int seat){
        this.a = a;
        this. seat = seat;

    }
    public void run(){
        a.book(seat);
    }
}

class C extends Thread{
    A a;
    int seat;
    C(A a,int seat){
        this.a = a;
        this. seat = seat;

    }
    public void run(){
        a.book(seat);
    }
}
public class StaticSynchronization {
    public static void main(String[] args) {

        A a = new A();

        B b = new B(a,7);
        b.start();


        C c = new C(a,7);
        c.start();

        //------------------------------

        A aa = new A();

        B bb = new B(aa,10);
        bb.start();

        C cc = new C(aa,10);
        cc.start();


    }
}
