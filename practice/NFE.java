public class NFE {
    public static void main(String[] args) {
    String inputData = "123456789mg";
    // This line will crash the program with a NumberFormatException
    int score = Integer.parseInt(inputData);
    System.out.println("The score is: " + score);
    }
}
