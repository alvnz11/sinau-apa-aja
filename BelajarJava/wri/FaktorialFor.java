import java.util.*;

public class FaktorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, factorial, i;

        System.out.print("Enter a number : ");
        number = input.nextInt();
        input.close();

        factorial = 1;
        for (i=1; i <= number; i++) {
            factorial = factorial * i;
            // System.out.println(i);
            System.out.println(factorial);
        }
        
        System.out.printf("The factorial of %d is %d\n ", number, factorial);
    }
}
