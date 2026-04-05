package usingExtendClass;

class Student1 extends Thread{
    @Override
    public void run() {
        System.out.println("Task 1");
    }

}

class Student2 extends Thread{
    @Override
    public void run() {
        System.out.println("Task 2");
    }

}
class Student3 extends Thread{
    @Override
    public void run() {
        System.out.println("Task 3");
    }

}
public class MultipleTaskWithMultipleThread {
    public static void main(String[] args) {

        Student1 s1 = new Student1();
        s1.start();

        Student2 s2 = new Student2();
        s2.start();

        Student3 s3 = new Student3();
        s3.start();
//        s2.start();

    }
}
