import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        int Length;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number!");
        Length = input.nextInt();

        int[] num = new int[Length];
        num[0] = 0;
        num[1] = 1;

        for (int i = 2; i < Length; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }

        System.out.println("Your sequence is: ");
        for (int i = 0; i < Length; i++) {
            System.out.print(num[i] + ", ");
        }
    }
}