
package prelim.exam;

public class PrelimExam {
     import java.util.Scanner;
     
    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter Principal Amount: ");
        double pa = scan.nextfloat();
        System.out.print("Enter Annual Interest Rate: ");
        double air = scan.nextfloat();
        
        double interest = pa*air/100;
        
        System.out.print("Interest for one year " + interest);
    }
    
}
