generics cannot do these

```java
public class Erased<T> {
  private final int SIZE = 100;
  public static void f(Object arg) {
    if(arg instanceof T) {}          // Error
    T var = new T();                 // Error
    T[] array = new T[SIZE];         // Error
    T[] array = (T)new Object[SIZE]; // Unchecked warning
  }
}
```

## create an object in generics class

by using reflection

```java
import static util.Print.*;

class ClassAsFactory<T> {
  T x;
  public ClassAsFactory(Class<T> kind) {
    try {
      x = kind.newInstance();
      System.out.println(x.getClass().getName());
    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
}

class Employee {}	

public class InstantiateGenericType {
  public static void main(String[] args) {
    ClassAsFactory<Employee> fe =
      new ClassAsFactory<Employee>(Employee.class);
    print("ClassAsFactory<Employee> succeeded");
    try {
      ClassAsFactory<Integer> fi =
        new ClassAsFactory<Integer>(Integer.class);
    } catch(Exception e) {
      print("ClassAsFactory<Integer> failed");
    }
  }
} /* Output:
Employee
ClassAsFactory<Employee> succeeded
ClassAsFactory<Integer> failed
*///:~
```

this won't work

```java
class Erased<T> {
    T t;
    public Erased(){
        t = (T) new Object();
	System.out.println(t.getClass().getSimpleName());
    }
    public T get(){
        return t;
    }
}

public class Test {
 public static void main(String[] args) {
    String a = new Erased<String>().get();
  }
}
/**
Object
Exception in thread "main" java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')
	at Test.main(Test.java:14) 
*/
```

## create an array in generics class

by using reflection

```java
import java.lang.reflect.*;
import java.util.*;

public class ArrayMaker<T> {
  private Class<T> kind;
  public ArrayMaker(Class<T> kind) { this.kind = kind; }
  @SuppressWarnings("unchecked")
  T[] create(int size) {
    // Array.newInstance() returns Object
    return (T[])Array.newInstance(kind, size);
  }
  public static void main(String[] args) {
    ArrayMaker<String> stringMaker =
      new ArrayMaker<String>(String.class);
    String[] stringArray = stringMaker.create(9);
    System.out.println(Arrays.toString(stringArray));
  }
} /* Output:
[null, null, null, null, null, null, null, null, null]
*///:~
```
