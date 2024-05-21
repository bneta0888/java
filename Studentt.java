public class Studentt {

    private String name;//instance variable
    private int age;
    private int rollNo;
    

    public Studentt(String name, int age, int rollNo ){

        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        Studentt student1 = new Studentt("Bneta", 19, 01);
        System.out.printf(" Name : %s\n age : %d\n RollNo : 01", student1.name,student1.age,student1.rollNo );
        
    }
    
}
