package Java_test_liuxin;

/**
 * Created by zhangxuelong on 2018/5/8
 */
class Fruit1{
    String name = "Fruit";
    public void print(int i){
        System.out.println("Fruit"+i);
    }
}
class Apple1 extends Fruit1{
    String name = "Apple";
    public void print(int i){
        System.out.println("Apple"+i);
    }
}
public class JavaTest {
    public static void main(String args[]){
        Apple1 apple = new Apple1();
        apple.print(100);
        System.out.println(apple.name);

        Fruit1 fruit = apple;
        fruit.print(100);
        System.out.println(fruit.name);
    }
}
