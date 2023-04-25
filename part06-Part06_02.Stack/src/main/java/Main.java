
public class Main {

    public static void main(String[] args) {
Stack s = new Stack();
System.out.println(s.isEmpty());
System.out.println(s.values());
s.add("first");
s.add("second");
s.add("third");
System.out.println(s.isEmpty());
System.out.println(s.values());
String taken = s.take();
System.out.println(s.isEmpty());
System.out.println(s.values());
System.out.println(taken);

    }
}
