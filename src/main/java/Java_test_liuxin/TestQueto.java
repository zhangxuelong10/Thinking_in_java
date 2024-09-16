package Java_test_liuxin;

/**
 * Created by zhangxuelong on 2018/5/7
 */
public class TestQueto {
    public static void changeStr(Person p) {
        p = new Person();
        p.age = 100;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.age = 50;
        changeStr(p);
        System.out.println(p.age);
    }

}

class Person {
    int age;
}
