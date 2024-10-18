

package lab.pulley;
import java.util.Scanner;

public class Pulley {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    System.out.println("Program to determine the speed of a pulley when two pullelys are connected with a belt ");
        System.out.println("Enter diameter 1: ");
        float diameter1= scan.nextFloat();
        System.out.println("Enter diameter 2: ");
       float diameter2= scan.nextFloat();
        System.out.println("Enter RPM1: ");
      float RPM1= scan.nextFloat();
        float RPM2 = diameter1/diameter2 * RPM1;
        System.out.println(" RPM2 : "+RPM2);
        
        
  System.out.println("Program to calculate the amount of weight lifted with multiple pulley system");
    System.out.println("Enter the exerted force: ");
     float forceExerted=scan.nextFloat();
        System.out.println("Enter the number of ropes: ");
     float ropes=scan.nextFloat();
     float weightLifted=forceExerted*ropes;
     System.out.println("The weight lifted is : "+weightLifted);
   
    }
}
