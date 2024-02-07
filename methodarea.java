import java.util.*;
public class methodarea {

    // Q2. Write a method that takes the radius of a circle as an argument and returns its area.

    static void areacal(double r){
        double area = Math.PI*r*r;
        System.out.println("area of circle is :"+area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius:");

        double r = sc.nextDouble();
        areacal(r);
    }
}
