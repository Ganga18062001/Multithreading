package synchronization;

class BookThreaterSeat1{
    int totalSeat = 10;

      void bookSeat1(int seats){//synchronized method

         System.out.println("Hii : "+Thread.currentThread().getName());
//         System.out.println("Hii : "+Thread.currentThread().getName());
//         System.out.println("Hii : "+Thread.currentThread().getName());
//         System.out.println("Hii : "+Thread.currentThread().getName());
//         System.out.println("Hii : "+Thread.currentThread().getName());

synchronized (this){
    if(totalSeat >= seats){
        System.out.println("Seat successfully book");
        totalSeat = totalSeat - seats;
        System.out.println("Reaming seats "+totalSeat);
    }else{
        System.out.println("sorry ,Better luck next time ,seat can not be book");
    }
}


         System.out.println("Hii : "+Thread.currentThread().getName());
//         System.out.println("Hii : "+Thread.currentThread().getName());
//         System.out.println("Hii : "+Thread.currentThread().getName());
//         System.out.println("Hii : "+Thread.currentThread().getName());
//         System.out.println("Hii : "+Thread.currentThread().getName());


     }
}
public class SynchronizationBlocks extends Thread {

    static BookThreaterSeat1 bb;
    int seat;
    @Override
    public void run() {
        bb.bookSeat1(seat);


    }

    public static void main(String[] args) {

        bb = new BookThreaterSeat1();

        SynchronizationBlocks sy = new SynchronizationBlocks();
        sy.seat = 9;
        sy.start();

        SynchronizationBlocks syn = new SynchronizationBlocks();
        syn.seat = 5;
        syn.start();



    }
}
