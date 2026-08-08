public class WithReturnValue {
    String getName() {
        return "Jathin";
    }
    public static void main(String[] args) {
        WithReturnValue obj = new WithReturnValue();
        String name = obj.getName();
        System.out.println("Name: " + name);
    }
}
