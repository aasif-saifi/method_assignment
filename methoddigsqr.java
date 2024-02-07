import java.util.*;
public class methoddigsqr {

    // Q1. Write a method to print squares of the first n natural numbers, taking n as an argument to the method.
    
    static void digcountsqr(int n){
         int count = 0;
         int temp = 0;
         for (; n >0;) {
            temp = n%10;
            n/=10;
            count ++;
            
         }
         System.out.println("total digit is:"+count);
         System.out.println("digit sqr is:"+(int)Math.pow(count, 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        digcountsqr(n);
    }


    
}
