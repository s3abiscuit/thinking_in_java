//: polymorphism/PrivateOverride.java
// Trying to override a private method.
import static util.Print.*;

public class PrivateOverride {
  // 向上转型得到的父类对象依然能够调用没有没被覆盖的方法
  private void f() { print("private f()"); }
  public void g() { print("public g()")}
  public static void main(String[] args) {
    // 向上转型得到了一个特殊的父类对象
    // 这个特殊对象在创建子类对象的时候就产生了
    PrivateOverride po = new Derived();
    po.f();
    po.g();
  }
}

class Derived extends PrivateOverride {
  public void f() { print("public f()"); }
} /* Output:
private f()
public g()
*///:~
