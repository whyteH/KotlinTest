/**
 * Created by Whyte on 2017/7/4.
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
         int i = 0;
        Person1 p = new Person1(1) {
            public void play() {
                System.out.println("play:" + i);
            }
        };
        p.play();
    }
}

abstract class Person1 {
    public Person1(int s) {
    }

    public abstract void play();
}