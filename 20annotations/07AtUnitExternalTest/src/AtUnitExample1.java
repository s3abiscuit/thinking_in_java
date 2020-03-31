//: annotations/AtUnitExample1.java

import util.OSExecute;

public class AtUnitExample1 {
    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }

    @atunit.Test
    boolean methodOneTest() {
        return methodOne().equals("This is methodOne");
    }

    @atunit.Test
    boolean m2() {
        return methodTwo() == 2;
    }

    @atunit.Test
    private boolean m3() {
        return true;
    }

    // Shows output for failure:
    @atunit.Test
    boolean failureTest() {
        return false;
    }

    @atunit.Test
    boolean anotherDisappointment() {
        return false;
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java atunit.AtUnit AtUnitExample1");
    }
} /* Output:
annotations.AtUnitExample1
  . methodOneTest
  . m2 This is methodTwo

  . m3
  . failureTest (failed)
  . anotherDisappointment (failed)
(5 tests)

>>> 2 FAILURES <<<
  annotations.AtUnitExample1: failureTest
  annotations.AtUnitExample1: anotherDisappointment
*///:~
