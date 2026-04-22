package synchronization;
 class BookThreaterSeat{
    int totalSeat = 10;

   synchronized void bookSeat(int seats){//synchronized method


        if(totalSeat >= seats){
            System.out.println("Seat successfully book");
             totalSeat = totalSeat - seats;
            System.out.println("Reaming seats "+totalSeat);
        }else{
            System.out.println("sorry ,Better luck next time ,seat can not be book");
        }

    }
}

public class MovieBookApp extends Thread {
    static BookThreaterSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }

    public  static void main(String[] args) throws Exception {
        b = new BookThreaterSeat();

        MovieBookApp m = new MovieBookApp();
        m.seats = 7;

        m.start();


        MovieBookApp m2 = new MovieBookApp();
        m2.seats = 6;
        m2.start();

    }
}
