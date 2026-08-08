
public class WithParameters{
  public void parameters(String name , int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        WithParameters pr = new WithParameters();
        pr.parameters("Jathin", 19);
    }
}