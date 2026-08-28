public class NPE{
     public static void main(String[] args) {
    String Name = null; // The reference points to nothing
    // This line will crash the program with a NullPointerException
    int length = Name.length();
    System.out.println("Name length is: " + length);
    }
}