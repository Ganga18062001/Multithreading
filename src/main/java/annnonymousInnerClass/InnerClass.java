package annnonymousInnerClass;
 class AA{
    int age;
    public void calaculateAge(){
        System.out.println("Calculate age");
    }
    static class BB{
        public void calculateHeight(){
            System.out.println("Calculate height");

        }
    }
//     class BB{
//         public void calculateHeight(){
//             System.out.println("Calculate height");
//
//         }
//     }
}
public class InnerClass {
    public static void main(String[] args) {

        AA aa = new AA();
        aa.calaculateAge();

//        AA.BB bb = aa.new BB();
//        bb.calculateHeight();

       //when inner classs is static

        AA.BB b = new AA.BB();
        b.calculateHeight();




    }
}
