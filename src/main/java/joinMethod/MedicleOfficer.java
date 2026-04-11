package joinMethod;

class MedicleTest extends Thread{

    public void run(){
        try{
            System.out.println("Medicle test start");
            Thread.sleep(1000);
            System.out.println("Medicle test completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class TestDrive extends Thread{

    public void run(){
        try{
            System.out.println("Test drive start");
            Thread.sleep(1000);
            System.out.println("Test drive completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class MedicleOfficer extends Thread {
    public void run(){
        try{
            System.out.println("Medicle officer");
            Thread.sleep(1000);
            System.out.println("Medicle officer sign");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException{

        MedicleTest me = new MedicleTest();
        me.start();
//       me.join();

        TestDrive testDrive = new TestDrive();
        testDrive.start();
//        testDrive.join();

        MedicleOfficer medicleOfficer = new MedicleOfficer();
        medicleOfficer.start();

    }
}
