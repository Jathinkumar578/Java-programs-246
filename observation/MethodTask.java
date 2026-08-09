public class MethodTask {
   static double area(double radius){
    return 3.14 * radius *radius;
   }
public static void main(String[] args) {
    Scanner r= new Scanner(System.in);
    double radius , result;
    System.out.println("enter the radius");
    radius =  r.nextDouble();
    result = area(radius);
    System.out.println("area = " + result);

}
    
}