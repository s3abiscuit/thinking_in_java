//: polymorphism/PrivateOverride.java
// Trying to override a private method.
import static util.Print.*;

public class PrivateOverride {
  // private method is also final method
  // can not be overridden
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
