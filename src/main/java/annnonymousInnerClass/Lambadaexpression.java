package annnonymousInnerClass;
interface Human{
    void play();
}
public class Lambadaexpression {
    public static void main(String[] args) {

        Human human = () ->{
            System.out.println("Human play");
        };human.play();

    }
}
