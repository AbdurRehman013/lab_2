

package lab.calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value of a =");
        int a=scan.nextInt();
         System.out.println("Enter value of b =");
        int b=scan.nextInt();
        int sum=a+b;
        int difference=a-b;
        int product=a*b;
        
        System.out.println("a + b = "+sum);
        System.out.println("a - b = "+difference);
        System.out.println("a * b = "+product);
       
    }
}
