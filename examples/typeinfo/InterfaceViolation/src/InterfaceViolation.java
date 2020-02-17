// Sneaking around an interface.

class B implements interfacea.A {
    public void f() {
    }

    public void g() {
    }
}

public class InterfaceViolation {
    public static void main(String[] args) {
        interfacea.A a = new B();
        a.f();
        // a.g(); // Compile error
        System.out.println(a.getClass().getName());
        if (a instanceof B) {
            B b = (B) a;
            b.g();
        }
    }
} /* Output:
B
*///:~
