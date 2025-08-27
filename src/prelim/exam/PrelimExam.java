
package prelim.exam;
    import java.util.Scanner;
public class PrelimExam {
     
     
    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter Principal Amount: ");
        double pa = scan.nextFloat();
        System.out.print("Enter Annual Interest Rate(%): ");
        double air = scan.nextFloat();
        
        double interest = pa*air/100;
        
        System.out.print("Interest for one year: " + interest);
    }
    
}
