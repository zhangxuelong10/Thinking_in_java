package Java_test_liuxin;

import java.util.Date;

/**
 * Created by zhangxuelong on 2018/5/8
 */
class Fruit {
    public void setDate(Object d) {
        System.out.println("Fruit.setDate(Object d)");
    }
}
class Apple extends Fruit {
    public void setDate(Date d) {
        System.out.println("Apple.setDate(Date d)");
    }
}
public class JavaTest3 {
    public static void main(String[] args) {
        Fruit f = new Apple();
        f.setDate(new Date());
    }
}
