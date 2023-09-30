import java.util.*;

public class jbs6tgs1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i, number;

        System.out.print("Enter a number : ");
        number = input.nextInt();

        for(i = 1; i <= number; i++) {
            System.out.println(i);
            if (i %5 == 4) {
                i += 2;
                while(i <= number) {
                System.out.println(i);
                break;
            }
            }
        }
        input.close();

    }
    
}
