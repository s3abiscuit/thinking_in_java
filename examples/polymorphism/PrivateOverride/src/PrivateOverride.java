//: polymorphism/PrivateOverride.java
// Trying to override a private method.
import static util.Print.*;

public class PrivateOverride {
  // 向上转型的本质
  // 相对于继承
  private void f() { print("private f()"); }
  public static void main(String[] args) {
    PrivateOverride po = new Derived();
    po.f();
  }
}

class Derived extends PrivateOverride {
  public void f() { print("public f()"); }
} /* Output:
private f()
*///:~
