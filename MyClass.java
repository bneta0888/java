public class MyClass {
    //Class Variable
    public static int classVariable = 10;
     
    public void myMethod(){
        //Local Variable
        int localVariable = 30;
        //creating object of dog class
        Dog dog = new Dog();

        System.out.println("Class variable: "+ classVariable);
        System.out.println("instacnce variable: "+ dog.value);
        System.out.println("Local variable: "+ localVariable);
    }
    public static void main (String[]args){
        MyClass obj1 = new MyClass();
        obj1.myMethod();
    }

}
