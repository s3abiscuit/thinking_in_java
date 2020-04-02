// A class with a util.Null Object.

class Person {
    public final String first;
    public final String last;
    public final String address;

    // etc.
    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }


} ///:~
