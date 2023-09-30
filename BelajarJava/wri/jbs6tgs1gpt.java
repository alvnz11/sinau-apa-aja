import java.util.Scanner;

public class jbs6tgs1gpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                // Skip multiples of 5
                continue;
            }
            System.out.println(i);
        }

        input.close();
    }
}
