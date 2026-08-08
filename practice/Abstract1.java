abstract class Abstract2 {
    int y;
   void first() {
       System.out.println("This is th first method");
   }
   abstract void second();
}
public class Abstract1 extends Abstract2{
   void second() {
       System.out.println("This is second method");
   }
public static void main (String[] args) {
Abstract1 ab= new Abstract1();
System.out.println(ab.y);
ab.first();
ab.second();
}
}
