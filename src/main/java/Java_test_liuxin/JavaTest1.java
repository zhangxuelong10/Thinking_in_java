package Java_test_liuxin;

/**
 * Created by zhangxuelong on 2018/5/8
 */
abstract class A{
    public abstract void before();
    public abstract void after();
    public void print(int i){
        before();
        System.out.println("A"+i);
        after();
    }
}
class B extends A{
    public  void before(){
        System.out.println("before B");
    }
    public  void after(){
        System.out.println("after B");
    }
}
public class JavaTest1 {
    public static void main(String args[]){
        A a = new B();
        a.print(100);
    }
}
