class person{
    String name;
    person (String name){
        this.name = name;
        System.out.println(" person name is ");
    }
    void show(){
        System.out.println(" name is" + name);
    }
}

class roll extends person{
    int rollno;
    roll( String name , int rollno){
        super(name);
        this.rollno = rollno;
        System.out.println("the roll number is");
    }
    void dis (){
        super.show();
        System.out.println(" roll number " + rollno);
    }
}
public class SuperKey {
public static void main(String[] args) {
 roll std = new roll("jathin", 246);
 std.dis();
    


}
    
}
