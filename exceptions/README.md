```java
class Hello {
  public static void main(String[] args) {
    System.out.println(10/0);
    System.out.println("continue");
  }
}

/* did not catch exception
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Hello.main(ApplesAndOrangesWithoutGenerics.java:35)

Process finished with exit code 1
 */
 ```
 
 ```java
 class Hello {
  public static void main(String[] args) {
    try {
      System.out.println(10/0);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("continue");
  }
}
/* catch exception
java.lang.ArithmeticException: / by zero
	at Hello.main(ApplesAndOrangesWithoutGenerics.java:31)
continue

Process finished with exit code 0
 */
 ```
