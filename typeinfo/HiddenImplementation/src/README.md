# HiddenImplementation

反编译 C.class
`javap -private C`

```
警告: 文件 ./C.class 不包含类 C
Compiled from "HiddenC.java"
class packageaccess.C implements interfacea.A {
  packageaccess.C();
  public void f();
  public void g();
  void u();
  protected void v();
  private void w();
}
```
