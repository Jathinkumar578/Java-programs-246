public class LoopState {
public static void main(String[] args) {
    Scanner f = new Scanner(System.in);
    int n;
    System.out.println("enter n");
    n  = f.nextInt();
    int a = 0 ;
    int  b= 1;
    System.out.println("the fibonacci series");
for( int i= 1; i<= n;i++){
    System.out.print(a+"");

int c = a+b;
a = b;
b = c;
}
}
}