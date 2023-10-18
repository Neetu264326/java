import java.util.Scanner;
//Write a function to print the sum of all odd numbers from 1 to n
public class oddno {
    public static int printSumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {


                sum += i;
                //System.out.println("value of i:" + i);
              //  System.out.println("value of sum :" + sum);
            }


        }
        System.out.println("Sum of all odd number between 0 to " + n + " = " + sum);
        return 0;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int n = sc.nextInt();
        printSumOfOdd(n);

    }
}