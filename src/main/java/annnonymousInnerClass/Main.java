package annnonymousInnerClass;
 class A{
    public  void show(){
        System.out.println("Class A show method");
    }
}

//class B extends A{
//    public void show(){
//        System.out.println("B class of show method");
//    }
//}
public class Main {
    public static void main(String[] args) {

//       A a = new B();
////        a.show();
//
//
//
//        B b = (B) a;
//        b.show();

        //anonymous class

        A a = new A(){
            @Override
            public void show() {
                System.out.println("Annonymous class");
            }
        };a.show();

    }
}
