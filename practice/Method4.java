public class Method4 {
   public int add(int a, int b) {
        return (a + b);
    }
    public static void main(String[] args) {
        Method4 obj = new Method4();
        int sum = obj.add(10, 20);
        System.out.println("Sum = " + sum);
    }
}
