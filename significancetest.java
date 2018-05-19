import java.util.*;
import java.util.Scanner.*;
import java.text.*;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
public class significancetest {
public static void main (String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Null Hypothesis (μ0)");
double nullB = input.nextDouble();
System.out.println("Sample Mean (x̅)");
double meanB = input.nextDouble();
System.out.println("Sample Standard Deviation (Sx)");
double deviationB = input.nextDouble();
System.out.println("Sample Size (n)");
double sizeB = input.nextDouble();
double tVal = (meanB-nullB)/(deviationB/sqrt(sizeB));
double dfVal = (sizeB - 1);
System.out.println("Your t-value is " + tVal +  " and your degrees of freedom is " + dfVal);
System.out.println("Alternative Hypothesis (μA) - μ ≠ μ0(1), μ < μ0(2), or μ > μ0?(3)");
int choice = input.nextInt();
if (choice == 1){
    System.out.println("Refer to this table: http://d2vlcm61l7u1fs.cloudfront.net/media%2F60a%2F60af5890-13ec-42d3-a274-5fc733ec37a4%2FphpYSVwdO.png.\nMultiply the p-value by 2 since this is a probability for a two-tail distribution. If the p-value is less than or equal to .05, reject the H0. If your p-value is greater than .05, you must fail to reject the H0." );
} else if (choice == 2){
  System.out.println("Refer to this table: http://d2vlcm61l7u1fs.cloudfront.net/media%2F60a%2F60af5890-13ec-42d3-a274-5fc733ec37a4%2FphpYSVwdO.png.\nIf the p-value is less than or equal to .05, reject the H0. If the p-value is greater than .05, you must fail to reject the H0." );
} else if (choice == 3){
   System.out.println("Refer to this table: http://d2vlcm61l7u1fs.cloudfront.net/media%2F60a%2F60af5890-13ec-42d3-a274-5fc733ec37a4%2FphpYSVwdO.png.\nIf the p-value is less than or equal to .05, reject the H0. If the p-value is greater than .05, you must fail to reject the H0." );
}
}
}
