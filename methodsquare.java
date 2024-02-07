import java.util.*;
public class methodsquare {

    // Q4. Write a method to count the number of digits in a number and then print the square of this number.
    
    static void numsquare(int n){
        for(int i = 1; i<=n; i++){
            System.out.println(i+" = "+(int)Math.pow(i,2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");

        int n = sc.nextInt();
        numsquare(n);
    }
}
