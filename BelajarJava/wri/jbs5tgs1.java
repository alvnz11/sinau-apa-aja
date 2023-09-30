import java.util.Scanner;

public class jbs5tgs1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter the first length of triangle : ");
        a = input.nextInt();
        System.out.println("Enter the second length of triangle : ");
        b = input.nextInt();
        System.out.println("Enter the third length of triangle : ");
        c = input.nextInt();
        input.close();

        if (a == b && b == c) {
            System.out.println("triangle is equilateral");
        } else if (a == b || b == c || c == a) {
            System.out.println("triangle is isosceles");
        } else {
            System.out.println("triangle is arbitrary");
        }
            
    }
    
}