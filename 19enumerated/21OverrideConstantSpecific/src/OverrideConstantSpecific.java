//: enumerated/OverrideConstantSpecific.java

import static util.Print.print;
import static util.Print.printnb;

public enum OverrideConstantSpecific {
    NUT, BOLT,
    WASHER {
        void f() {
            print("Overridden method");
        }
    };

    void f() {
        print("default behavior");
    }

    public static void main(String[] args) {
        for (OverrideConstantSpecific ocs : values()) {
            printnb(ocs + ": ");
            ocs.f();
        }
    }
} /* Output:
NUT: default behavior
BOLT: default behavior
WASHER: Overridden method
*///:~
