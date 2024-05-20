import java.util.Scanner;

public class Calculator1 {
   
    public static void main(String[] args) {

        //Taking input from user

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number :");
        int firstNum = scanner.nextInt();

        System.out.println("Enter second number : ");
        int secondNum = scanner.nextInt();


        int sum = firstNum + secondNum;
        System.out.println(" The Sum of firstNum and secondNum is : " + sum);

        int diff = firstNum - secondNum;
        System.out.println(" The Different of firstNum and secondNum is : " + diff);

        int multiply = firstNum * secondNum;
        System.out.println(" The Multiply of firstNum and secondNumis : " + multiply);

        float div = (float) firstNum / (float) secondNum;
        System. out.println(" The Division of firstNum and secondNum is : " + div);

        scanner.close();

    }

    
}

    

