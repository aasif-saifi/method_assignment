import java.util.*;
public class methododd {

    // Q3. Given two numbers a and b, write a method to print all odd numbers between them.
    
    static void oddatob(int a, int b){
        for (int i = a; i <= b; i++) {
            if (i%2==1) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a:");
        int a = sc.nextInt();
        System.out.print("enter number b:");
        int b = sc.nextInt();
        oddatob(a, b);
    }
}
